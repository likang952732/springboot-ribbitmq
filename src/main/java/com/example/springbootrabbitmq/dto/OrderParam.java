package com.example.springbootrabbitmq.dto;

import lombok.Data;

/*
 @Description
 *@author kang.li
 *@date 2020/7/1 18:10   
 */
@Data
public class OrderParam {
    //收货地址id
    private Long memberReceiveAddressId;
    //优惠券id
    private Long couponId;
    //使用的积分数
    private Integer useIntegration;
    //支付方式
    private Integer payType;
}
