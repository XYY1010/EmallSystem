package com.emall.dao;

import com.emall.dataobject.SellerCommentDO;

import java.util.List;

public interface SellerCommentDOMapper {

    int deleteByPrimaryKey(String sellerCommentId);

    int insert(SellerCommentDO record);

    int insertSelective(SellerCommentDO record);

    SellerCommentDO selectByPrimaryKey(String sellerCommentId);

    int updateByPrimaryKeySelective(SellerCommentDO record);

    int updateByPrimaryKey(SellerCommentDO record);

    List<SellerCommentDO> selectByUserId(String userId);
}