package com.emall.dao;

import com.emall.dataobject.BuyerCommentDO;

public interface BuyerCommentDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_buyer_comment
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    int deleteByPrimaryKey(String buyerCommentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_buyer_comment
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    int insert(BuyerCommentDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_buyer_comment
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    int insertSelective(BuyerCommentDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_buyer_comment
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    BuyerCommentDO selectByPrimaryKey(String buyerCommentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_buyer_comment
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    int updateByPrimaryKeySelective(BuyerCommentDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_buyer_comment
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(BuyerCommentDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_buyer_comment
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    int updateByPrimaryKey(BuyerCommentDO record);
    int getCommentCount(String itemId);
}