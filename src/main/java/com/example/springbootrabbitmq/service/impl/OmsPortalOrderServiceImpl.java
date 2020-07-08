package com.example.springbootrabbitmq.service.impl;

import com.example.springbootrabbitmq.common.CommonResult;
import com.example.springbootrabbitmq.component.CancelOrderSender;
import com.example.springbootrabbitmq.dto.OrderParam;
import com.example.springbootrabbitmq.service.OmsPortalOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*
 @Description
 *@author kang.li
 *@date 2020/7/1 18:04   
 */
@Slf4j
@Service
public class OmsPortalOrderServiceImpl implements OmsPortalOrderService {
    @Autowired
    private CancelOrderSender cancelOrderSender;

    @Transactional
    @Override
    public CommonResult generateOrder(OrderParam orderParam) {
        log.info("process generateOrder");
        //下单完成后开启一个延迟消息，用于当用户没有付款时取消订单（orderId应该在下单后生成）
        sendDelayMessageCancelOrder(11L);
        return CommonResult.success(null, "下单成功");
    }

    @Transactional
    @Override
    public void cancelOrder(Long orderId) {
        log.info("process cancelOrder orderId:{}",orderId);
    }

    private void sendDelayMessageCancelOrder(Long orderId) {
        //获取订单超时时间，假设为30分钟
        long delayTimes = 30 * 1000;
        //发送延迟消息
        cancelOrderSender.sendMessage(orderId, delayTimes);
    }
}
