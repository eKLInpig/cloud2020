package com.pig.springcloud.controller;

import com.pig.springcloud.entities.CommonResult;
import com.pig.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author eklin
 * @create 2020-03-08 21:42
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, Payment> hashMap = new HashMap<>();

    static {
        hashMap.put(1L, new Payment(1L, "Pig"));
        hashMap.put(2L, new Payment(2L, "Cat"));
        hashMap.put(3L, new Payment(3L, "Dog"));
    }

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        Payment payment = hashMap.get(id);
        return new CommonResult<>(200, "from mysql, serverPort: " + serverPort, payment);
    }

}
