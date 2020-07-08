package com.example.springbootrabbitmq.controller;

import com.example.springbootrabbitmq.dto.OrderParam;
import com.example.springbootrabbitmq.service.OmsPortalOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
 @Description 订单管理
 *@author kang.li
 *@date 2020/7/1 18:06   
 */
@Api(tags = "OmsPortalOrderController", description = "订单管理")
@RestController
@RequestMapping("/order")
public class OmsPortalOrderController {
    @Autowired
    private OmsPortalOrderService portalOrderService;

    @ApiOperation("生成订单")
    @PostMapping("/generateOrder")
    @ResponseBody
    public Object generateOrder(OrderParam orderParam) {
        return portalOrderService.generateOrder(orderParam);
    }
}
