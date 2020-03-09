package com.pig.springcloud.service.impl;

import com.pig.springcloud.dao.PaymentDao;
import com.pig.springcloud.entities.Payment;
import com.pig.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author eklin
 * @create 2020-03-05 14:32
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
