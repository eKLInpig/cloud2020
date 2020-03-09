package com.pig.springcloud.controller;

import com.pig.springcloud.domain.CommonResult;
import com.pig.springcloud.domain.Order;
import com.pig.springcloud.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author eklin
 * @create 2020-03-09 11:56
 */
@RestController
@Slf4j
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }

}
