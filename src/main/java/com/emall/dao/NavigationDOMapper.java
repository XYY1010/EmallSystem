package com.emall.dao;

import com.emall.dataobject.NavigationDO;

public interface NavigationDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_navigation
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_navigation
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    int insert(NavigationDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_navigation
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    int insertSelective(NavigationDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_navigation
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    NavigationDO selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_navigation
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    int updateByPrimaryKeySelective(NavigationDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_navigation
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    int updateByPrimaryKey(NavigationDO record);
}