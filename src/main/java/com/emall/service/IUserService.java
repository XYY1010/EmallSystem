package com.emall.service;

import com.emall.error.BusinessException;
import com.emall.form.UserForm;
import com.emall.response.CommonReturnType;

/**
 * Created by kimvra on 2018/12/26
 */
public interface IUserService {
    CommonReturnType login(String username, String password) throws BusinessException;

    CommonReturnType register(String username, String email, String telephone,
                              String password, String confirmPassword) throws BusinessException;

    CommonReturnType userInfo(UserForm userForm, String userId) throws BusinessException;
}
