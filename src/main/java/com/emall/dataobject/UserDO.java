package com.emall.dataobject;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class UserDO {

    private String userId;

    private String userName;

    private String telephone;

    private String address;

    private String email;

    private Boolean gender;

    private String avatarUrl;

    private Date birthday;

    private String hometown;

    private String realname;
}