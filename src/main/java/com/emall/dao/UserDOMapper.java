package com.emall.dao;

import com.emall.dataobject.UserDO;
import org.apache.ibatis.annotations.Param;

public interface UserDOMapper {

    int deleteByPrimaryKey(String userId);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    UserDO selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);

    int checkUsername(String username);

    int checkEmail(String email);

    int checkTelephone(String telephone);

    String selectLogin(@Param("username") String username, @Param("password") String password);
}