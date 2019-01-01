package com.emall.dao;

import com.emall.dataobject.AddressDO;
import org.apache.ibatis.annotations.Param;

public interface AddressDOMapper {

    int deleteByPrimaryKey(String addressId);

    int insert(AddressDO record);

    int insertSelective(AddressDO record);

    AddressDO selectByPrimaryKey(String addressId);

    int updateByPrimaryKeySelective(AddressDO record);

    int updateByPrimaryKey(AddressDO record);

    int selectByUserId(String userId);

    int deleteByUserIdAndAddressId(@Param("userId") String userId, @Param("addressId") String addressId);
}