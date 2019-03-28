package com.emall.dao;

import com.emall.dataobject.OrderItemDO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderItemDOMapper {
    List<OrderItemDO> selectAllOrdersByUserId(String userId);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_order_item
     *
     * @mbg.generated Mon Feb 18 16:18:55 CST 2019
     */
    int deleteByPrimaryKey(String orderItemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_order_item
     *
     * @mbg.generated Mon Feb 18 16:18:55 CST 2019
     */
    int insert(OrderItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_order_item
     *
     * @mbg.generated Mon Feb 18 16:18:55 CST 2019
     */
    int insertSelective(OrderItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_order_item
     *
     * @mbg.generated Mon Feb 18 16:18:55 CST 2019
     */
    OrderItemDO selectByPrimaryKey(String orderItemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_order_item
     *
     * @mbg.generated Mon Feb 18 16:18:55 CST 2019
     */
    int updateByPrimaryKeySelective(OrderItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_order_item
     *
     * @mbg.generated Mon Feb 18 16:18:55 CST 2019
     */
    int updateByPrimaryKey(OrderItemDO record);
    List<OrderItemDO> selectByItemId(String itemId);
}