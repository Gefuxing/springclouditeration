package com.gefuxing.controller;

import com.gefuxing.entities.CommonResult;
import com.gefuxing.service.PaymentService;
//import com.gefuxing.springcloud.entities.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author gefuxing
 * @create 2021/5/12 18:17
 */
@RestController
public class PaymentControllerClient {
    @Autowired
    private PaymentService paymentService;


    @GetMapping(value = "/consumer/payment/{id}")
    public CommonResult getPaymentById(@PathVariable(value = "id") Long id) {
        return paymentService.getPayment(id);
    }
    @GetMapping(value = "/consumer/payment/timeout")
    public String timeout() {
        return paymentService.paymentFeignTimeout();
    }

}
