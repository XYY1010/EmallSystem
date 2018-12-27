package com.emall.dao;

import com.emall.dataobject.ShoppingCartDO;

public interface ShoppingCartDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_shopping_cart
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    int deleteByPrimaryKey(String cartId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_shopping_cart
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    int insert(ShoppingCartDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_shopping_cart
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    int insertSelective(ShoppingCartDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_shopping_cart
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    ShoppingCartDO selectByPrimaryKey(String cartId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_shopping_cart
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    int updateByPrimaryKeySelective(ShoppingCartDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_shopping_cart
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(ShoppingCartDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_shopping_cart
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    int updateByPrimaryKey(ShoppingCartDO record);
}