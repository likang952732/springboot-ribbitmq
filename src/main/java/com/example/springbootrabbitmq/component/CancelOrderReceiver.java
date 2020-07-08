package com.example.springbootrabbitmq.component;

import com.example.springbootrabbitmq.service.OmsPortalOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 @Description 取消订单消息的处理者
 *@author kang.li
 *@date 2020/7/1 18:01   
 */
@Component
@Slf4j
@RabbitListener(queues = "mall.order.cancel")
public class CancelOrderReceiver {
    @Autowired
    private OmsPortalOrderService portalOrderService;
    @RabbitHandler
    public void handle(Long orderId){
        log.info("receive delay message orderId:{}",orderId);
        portalOrderService.cancelOrder(orderId);
    }
}
