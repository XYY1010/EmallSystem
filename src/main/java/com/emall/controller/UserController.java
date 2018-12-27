package com.emall.controller;

import com.emall.common.Const;
import com.emall.error.BusinessException;
import com.emall.error.EmBusinessError;
import com.emall.form.UserForm;
import com.emall.response.CommonReturnType;
import com.emall.service.IUserService;
import com.emall.utils.CookieUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.concurrent.TimeUnit;

/**
 * Created by kimvra on 2018/12/26
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private IUserService userService;

    @PostMapping("/login")
    public CommonReturnType login(String userName, String password,
                                  HttpSession session,
                                  HttpServletResponse response) throws BusinessException{
        CommonReturnType returnType = userService.login(userName, password);
        if (returnType.isSuccess()) {
            //写入cookie
            CookieUtil.writeLoginToken(response, session.getId());
            //写入redis
            redisTemplate.opsForValue().set(session.getId(), returnType.getData().toString(), Const.REDIS_SESSION_EXPIRETIME, TimeUnit.SECONDS);
        }
        return returnType;
    }

    @PostMapping("/register")
    public CommonReturnType register(String username, String password,
                                     String confirmPassword, String email, String telephone) throws BusinessException {
        return userService.register(username, email, telephone, password, confirmPassword);
    }

    @GetMapping("/logout")
    public CommonReturnType logout(HttpServletRequest request, HttpServletResponse response) {
        String loginToken = CookieUtil.readLoginToken(request);
        CookieUtil.delLoginToken(request, response);
        redisTemplate.delete(loginToken);
        return CommonReturnType.create(null);
    }

    @PostMapping("userInfo")
    public CommonReturnType userInfo(@Valid UserForm userForm, BindingResult bindingResult,
                                     HttpServletRequest request) throws BusinessException {
        if (bindingResult.hasErrors()) {
            //System.out.println(bindingResult.getAllErrors().toString());
            log.error("参数错误", new BusinessException(EmBusinessError.PARAM_ERROR, bindingResult.getFieldError().getDefaultMessage()));
            throw new BusinessException(EmBusinessError.PARAM_ERROR, bindingResult.getFieldError().getDefaultMessage());
        }
        String token = CookieUtil.readLoginToken(request);
        if (StringUtils.isBlank(token)) {
            log.error("token过期", new BusinessException(EmBusinessError.TOKEN_EXPIRED));
            throw new BusinessException(EmBusinessError.TOKEN_EXPIRED);
        }
        String userId = redisTemplate.opsForValue().get(token);
        CommonReturnType returnType = userService.userInfo(userForm, userId);
        if (returnType.isSuccess()) {
            redisTemplate.opsForValue().set(token, userId, Const.REDIS_SESSION_EXPIRETIME);
        }
        return returnType;
    }

    @GetMapping("/test")
    public String test() {
        log.info("test");
        return "test";
    }

}
