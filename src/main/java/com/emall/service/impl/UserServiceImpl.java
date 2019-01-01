package com.emall.service.impl;

import com.emall.common.Const;
import com.emall.controller.viewobject.AddressVO;
import com.emall.controller.viewobject.UserVO;
import com.emall.dao.AddressDOMapper;
import com.emall.dao.UserDOMapper;
import com.emall.dao.UserPasswordDOMapper;
import com.emall.dataobject.AddressDO;
import com.emall.dataobject.UserDO;
import com.emall.dataobject.UserPasswordDO;
import com.emall.error.BusinessException;
import com.emall.error.EmBusinessError;
import com.emall.response.CommonReturnType;
import com.emall.service.IUserService;
import com.emall.utils.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by kimvra on 2018/12/26
 */
@Service("userService")
@Slf4j
public class UserServiceImpl implements IUserService {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private UserDOMapper userDOMapper;

    @Autowired
    private UserPasswordDOMapper userPasswordDOMapper;

    @Autowired
    private AddressDOMapper addressDOMapper;

    /**
     *
     * @param username 用户名
     * @param password 密码
     * @return CommonReturnType
     * @throws Exception BusinessException
     */
    @Override
    public CommonReturnType login(String username, String password) throws BusinessException{
        int result  = userDOMapper.checkUsername(username);
        if (result == 0) {
            log.error("用户不存在", new BusinessException(EmBusinessError.USER_NOT_EXIST));
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST);
        }
        String encrptPassword = MD5Util.MD5EncodeUTF8(password);
        String userId = userDOMapper.selectLogin(username, encrptPassword);
        if (StringUtils.isBlank(userId)) {
            log.error("用户密码错误", new BusinessException(EmBusinessError.USER_PASSWORD_ERROR));
            throw new BusinessException(EmBusinessError.USER_PASSWORD_ERROR);
        }
        return CommonReturnType.create(userId);
    }

    /**
     *
     * @param username 用户名
     * @param email 邮箱
     * @param telephone 电话
     * @param password 密码
     * @param confirmPassword 确认密码
     * @return CommonReturnType
     * @throws Exception 注册异常
     */
    @Override
    public CommonReturnType register(String username, String email, String telephone,
                                     String password, String confirmPassword) throws BusinessException{
        if (StringUtils.isBlank(username) || StringUtils.isBlank(email) || StringUtils.isBlank(telephone)
                || StringUtils.isBlank(password) || StringUtils.isBlank(confirmPassword)) {
            log.error("校验参数错误", new BusinessException(EmBusinessError.PARAM_ERROR));
            throw new BusinessException(EmBusinessError.PARAM_ERROR);
        }

        if (checkValid(username, Const.USERNAME) && checkValid(email, Const.EMAIL) &&
                checkValid(telephone, Const.TELEPHONE)) {
            if (!StringUtils.equals(password, confirmPassword)) {
                log.error("两次密码输入不一致", new BusinessException(EmBusinessError.USER_PASSWORD_CONFIRM_ERROR));
                throw new BusinessException(EmBusinessError.USER_PASSWORD_CONFIRM_ERROR);
            } else {
                String userId = KeyUtil.generateId();
                UserPasswordDO userPasswordDO = new UserPasswordDO();
                userPasswordDO.setEncrptPassword(MD5Util.MD5EncodeUTF8(password));
                userPasswordDO.setUserId(userId);
                int result = userPasswordDOMapper.insert(userPasswordDO);
                if (result == 0) {
                    log.error("用户注册失败", new BusinessException(EmBusinessError.USER_REGISTER_FAIL));
                    throw new BusinessException(EmBusinessError.USER_REGISTER_FAIL);
                }
                UserDO userDO = new UserDO();
                userDO.setUserId(userId);
                userDO.setUserName(username);
                userDO.setTelephone(telephone);
                userDO.setEmail(email);
                result = userDOMapper.insertSelective(userDO);
                if (result == 0) {
                    log.error("用户注册失败", new BusinessException(EmBusinessError.USER_REGISTER_FAIL));
                    throw new BusinessException(EmBusinessError.USER_REGISTER_FAIL);
                }
                return CommonReturnType.create(null);
            }
        }else {
            log.error("用户校验参数异常", new BusinessException(EmBusinessError.USER_CHECK_PARAM_ERROR));
            throw new BusinessException(EmBusinessError.USER_CHECK_PARAM_ERROR);
        }
    }

    /**
     *
     * @param param 校验参数
     * @param type 校验类型(username、email、telephone)
     * @return 返回成功或失败
     * @throws Exception 校验失败异常
     */
    private boolean checkValid(String param, String type) throws BusinessException{
        if (StringUtils.isNotBlank(type)) {
            if (StringUtils.equals(Const.USERNAME, type)) {
                int result = userDOMapper.checkUsername(param);
                if (result > 0) {
                    log.error("用户名已存在", new BusinessException(EmBusinessError.USERNAME_EXISTS));
                    throw new BusinessException(EmBusinessError.USERNAME_EXISTS);
                }
            } else if (StringUtils.equals(Const.EMAIL, type)) {
                int result = userDOMapper.checkEmail(param);
                if (result > 0) {
                    log.error("用户邮箱已被绑定", new BusinessException(EmBusinessError.USER_EMAIL_EXISTS));
                    throw new BusinessException(EmBusinessError.USER_EMAIL_EXISTS);
                }
            } else if (StringUtils.equals(Const.TELEPHONE, type)) {
                int result = userDOMapper.checkTelephone(param);
                if (result > 0) {
                    log.error("电话已被绑定", new BusinessException(EmBusinessError.USER_TELEPHONE_EXISTS));
                    throw new BusinessException(EmBusinessError.USER_TELEPHONE_EXISTS);
                }
            }
            return true;
        } else {
            log.error("用户校验类型错误", new BusinessException(EmBusinessError.USER_CHECK_TYPE_ERROR));
            throw new BusinessException(EmBusinessError.USER_CHECK_TYPE_ERROR);
        }
    }


    @Override
    public CommonReturnType userInfo(UserVO userVO, HttpServletRequest request) throws BusinessException{
        if (checkValid(userVO.getUserName(), Const.USERNAME)) {
            UserDO userDO = new UserDO();
            BeanUtils.copyProperties(userVO, userDO);
            String userId = getUserId(request).getData().toString();
            userDO.setUserId(userId);
            if (userVO.getGender() == Const.MAN_CODE) {
                userDO.setGender(true);
            }
            if (userVO.getGender() == Const.WOMEN_CODE) {
                userDO.setGender(false);
            }
            if (userVO.getBirthday() != null) {
                userDO.setBirthday(DateTimeUtil.str2Date(userVO.getBirthday()));
            }
            int result = userDOMapper.updateByPrimaryKeySelective(userDO);
            if (result == 0) {
                log.error("更新用户信息失败", new BusinessException(EmBusinessError.UPDATE_USER_INFO_ERROR));
                throw new BusinessException(EmBusinessError.UPDATE_USER_INFO_ERROR);
            }
            return CommonReturnType.create(userDO);
        } else {
            log.error("校验参数类型错误", new BusinessException(EmBusinessError.USER_CHECK_TYPE_ERROR));
            throw new BusinessException(EmBusinessError.USER_CHECK_TYPE_ERROR);
        }
    }

    /**
     *
     * @param email 邮箱
     * @return 成功或失败
     * @throws BusinessException 异常
     */
    @Override
    public CommonReturnType modifyEmail(String email, HttpServletRequest request) throws BusinessException{
        if (checkValid(email, Const.EMAIL)) {
            UserDO userDO = new UserDO();
            String userId = getUserId(request).getData().toString();
            userDO.setUserId(userId);
            userDO.setEmail(email);
            int result = userDOMapper.updateByPrimaryKeySelective(userDO);
            if (result == 0) {
                return CommonReturnType.create("修改邮箱失败", "fail");
            }
            return CommonReturnType.create(email);
        }
        return CommonReturnType.create("修改邮箱失败", "fail");
    }

    /**
     *
     * @param tel 电话
     * @return 成功或失败
     * @throws BusinessException 异常
     */
    @Override
    public CommonReturnType modifyTel(String tel, HttpServletRequest request) throws BusinessException{
        String userId = getUserId(request).getData().toString();
        if (checkValid(tel, Const.TELEPHONE)) {
            UserDO userDO = new UserDO();
            userDO.setUserId(userId);
            userDO.setTelephone(tel);
            int result = userDOMapper.updateByPrimaryKeySelective(userDO);
            if (result == 0) {
                return CommonReturnType.create("修改电话号码失败", "fail");
            }
            return CommonReturnType.create(tel);
        }
        return CommonReturnType.create("修改电话号码失败", "fail");
    }


    /**
     *
     * @param oldPwd 旧密码
     * @param newPwd 新密码
     * @param confirmPwd 确认密码
     * @return 成功或失败
     * @throws BusinessException 异常
     */
    @Override
     public CommonReturnType modifyPassword(String oldPwd, String newPwd, String confirmPwd, HttpServletRequest request) throws BusinessException{
        String userId = getUserId(request).getData().toString();
        UserPasswordDO userPasswordDO = userPasswordDOMapper.selectByUserId(userId);
        if (userPasswordDO == null) {
            return CommonReturnType.create("无该用户信息", "fail");
        }
        String encrptPwd = userPasswordDO.getEncrptPassword();
        if (!StringUtils.equals(MD5Util.MD5EncodeUTF8(oldPwd), encrptPwd)) {
            return CommonReturnType.create("原密码输入错误", "fail");
        }
        if (!StringUtils.equals(newPwd, confirmPwd)) {
            return CommonReturnType.create("两次密码输入不一致,请重新输入", "fail");
        }
        userPasswordDO.setEncrptPassword(MD5Util.MD5EncodeUTF8(newPwd));
        int result = userPasswordDOMapper.updateByPrimaryKey(userPasswordDO);
        if (result == 0) {
            return CommonReturnType.create("修改密码失败", "fail");
        }
        return CommonReturnType.create("修改密码成功");
    }

    private CommonReturnType getUserId(HttpServletRequest request) {
        String token = CookieUtil.readLoginToken(request);
        if (StringUtils.isBlank(token)) {
            return CommonReturnType.create("token失效,请重新登录", "fail");
        }
        String userId = redisTemplate.opsForValue().get(token);
        if (StringUtils.isBlank(userId)) {
            return CommonReturnType.create("用户信息失效,请重新登陆", "fail");
        }
        return CommonReturnType.create(userId);
    }

    /**
     *
     * @param addressVO 收获地址VO
     * @param request 获取userId
     * @return 成功或失败
     */
    @Override
    public CommonReturnType addAddress(AddressVO addressVO, HttpServletRequest request) throws BusinessException{
        AddressDO addressDO = new AddressDO();
        BeanUtils.copyProperties(addressVO, addressDO);
        String userId = getUserId(request).getData().toString();
        if (StringUtils.isBlank(userId)) {
            log.error("查不到用户的信息", new BusinessException(EmBusinessError.USER_NOT_EXIST));
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST);
        }
        addressDO.setUserId(userId);
        String addressId = SnowFlake.genId();
        addressDO.setAddressId(addressId);
        int result = addressDOMapper.selectByUserId(userId);
        if (result == 0) {
            addressDO.setIsDefault(true);
        }
        result = addressDOMapper.insertSelective(addressDO);
        if (result == 0) {
            return CommonReturnType.create("添加收获地址失败", "fail");
        }
        return CommonReturnType.create(addressVO);
    }

    /**
     *
     * @param addressId 地址id
     * @param request 用户相关信息
     * @return 返回成功或失败
     * @throws BusinessException 异常
     */
    @Override
    public CommonReturnType delAddress(String addressId, HttpServletRequest request) throws BusinessException{
        String userId = getUserId(request).getData().toString();
        if (StringUtils.isBlank(userId)) {
            log.error("查不到用户的信息", new BusinessException(EmBusinessError.USER_NOT_EXIST));
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST);
        }
        int rowCount = addressDOMapper.deleteByUserIdAndAddressId(userId, addressId);
        if (rowCount == 0) {
            return CommonReturnType.create("删除地址失败", "fail");
        }
        return CommonReturnType.create("删除地址成功");
    }
}
