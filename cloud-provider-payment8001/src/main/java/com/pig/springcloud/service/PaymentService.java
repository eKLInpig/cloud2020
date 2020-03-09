package com.pig.springcloud.service;

import com.pig.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author eklin
 * @create 2020-03-05 14:31
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
