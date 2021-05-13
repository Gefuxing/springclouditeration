package com.gefuxing.springcloud.controller;

import com.gefuxing.springcloud.entities.CommonResult;
import com.gefuxing.springcloud.entities.Payment;
import com.gefuxing.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/**
 * @Author gefuxing
 * @create 2021/4/5 19:59
 */
@RestController
public class PaymentController {

    @Autowired
    PaymentService paymentService;
    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/{id}")
    public CommonResult getPayment(@PathVariable Long id) {
        Payment payment = paymentService.getPayment(id);
        return new CommonResult(200, "成功+port"+port,payment);
    }

    @PostMapping("/payment")
    public CommonResult postPayment(@RequestBody Payment payment) {
        int a = paymentService.postPayment(payment);
        return new CommonResult(200, "成功", a);
    }


    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout(){
        try { TimeUnit.SECONDS.sleep(3); }catch (Exception e) {e.printStackTrace();}
        return port+"port";
    }
}
