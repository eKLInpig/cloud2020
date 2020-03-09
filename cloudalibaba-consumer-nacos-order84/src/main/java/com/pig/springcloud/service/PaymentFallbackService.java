package com.pig.springcloud.service;

import com.pig.springcloud.entities.CommonResult;
import com.pig.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author eklin
 * @create 2020-03-08 22:55
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, "服务降级返回, PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}
