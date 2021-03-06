package com.emall.dao;

import com.emall.dataobject.OrderDO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderDOMapper {
    List<OrderDO> selectAllOrdersByUserId(String userId);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_order
     *
     * @mbg.generated Thu Mar 28 09:09:13 CST 2019
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_order
     *
     * @mbg.generated Thu Mar 28 09:09:13 CST 2019
     */
    int insert(OrderDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_order
     *
     * @mbg.generated Thu Mar 28 09:09:13 CST 2019
     */
    int insertSelective(OrderDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_order
     *
     * @mbg.generated Thu Mar 28 09:09:13 CST 2019
     */
    OrderDO selectByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_order
     *
     * @mbg.generated Thu Mar 28 09:09:13 CST 2019
     */
    int updateByPrimaryKeySelective(OrderDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_order
     *
     * @mbg.generated Thu Mar 28 09:09:13 CST 2019
     */
    int updateByPrimaryKey(OrderDO record);
}