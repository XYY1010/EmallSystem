package com.emall.form;

import lombok.Getter;
import lombok.Setter;


import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by kimvra on 2018/12/27
 */
@Getter
@Setter
public class UserForm {

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
