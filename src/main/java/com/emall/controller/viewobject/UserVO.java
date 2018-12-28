package com.emall.controller.viewobject;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Created by kimvra on 2018/12/28
 */
@Setter
@Getter
public class UserVO {
    private String avatarUrl;

    @NotBlank(message = "昵称不能为空")
    private String userName;

    private String realname;

    @NotNull(message = "性别不能为空")
    private int gender;

    private String birthday;

    private String address;

    private String hometown;
}
