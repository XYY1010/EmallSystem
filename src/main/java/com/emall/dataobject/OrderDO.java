package com.emall.dataobject;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class OrderDO {

    private String orderId;

    private String userId;

    private BigDecimal payment;

    private Integer paymentType;

    private BigDecimal postage;

    private Integer orderStatus;

    private BigDecimal totalPrice;

    private Date paymentTime;

    private Date sendTime;

    private Date endTime;

    private Date closeTime;

    private Date createTime;

    private Date updateTime;

}