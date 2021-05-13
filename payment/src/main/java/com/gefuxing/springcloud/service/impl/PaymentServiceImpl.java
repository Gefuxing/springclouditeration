package com.gefuxing.springcloud.service.impl;

import com.gefuxing.springcloud.entities.Payment;

import com.gefuxing.springcloud.mapper.PaymentMapper;
import com.gefuxing.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author gefuxing
 * @create 2021/4/5 20:01
 */
@Service
public class PaymentServiceImpl  implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public Payment getPayment(Long id) {
        System.out.println("我爱你");
        return paymentMapper.select(id);
    }

    @Override
    public int postPayment(Payment payment) {
        return paymentMapper.insertSelective(payment);
    }
}
