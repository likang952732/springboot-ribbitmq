package com.example.springbootrabbitmq.service;

import com.example.springbootrabbitmq.common.CommonResult;
import com.example.springbootrabbitmq.dto.OrderParam;

/*
 @Description 前台订单管理Service
 *@author kang.li
 *@date 2020/7/1 18:02   
 */
public interface OmsPortalOrderService {
    /**
     * 根据提交信息生成订单
     */
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     */
    void cancelOrder(Long orderId);
}
