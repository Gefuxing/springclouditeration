package com.gefuxing.springcloud.service;

import com.gefuxing.springcloud.entities.Payment;

/**
 * @Author gefuxing
 * @create 2021/4/5 20:01
 */

public interface PaymentService {
    Payment getPayment(Long id) throws InterruptedException;

    int postPayment(Payment payment);
}
