package com.pig.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author eklin
 * @create 2020-03-07 10:55
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK, ￣へ￣";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_ItmeOut, ￣へ￣";
    }
}
