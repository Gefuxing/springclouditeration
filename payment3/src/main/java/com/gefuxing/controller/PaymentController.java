package com.gefuxing.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @Author gefuxing
 * @create 2021/4/5 19:59
 */
@RestController
public class PaymentController {


    @Value("${server.port}")
    private String port;





        @GetMapping(value = "/payment/zk")
        public String paymentzk(){
            return "springcloud with zookeeper:"+port+"\t"+ UUID.randomUUID().toString();
        }

    }

//
//    @PostMapping("/payment")
//    public CommonResult postPayment(@RequestBody Payment payment) {
//        int a = paymentService.postPayment(payment);
//        return new CommonResult(200, "成功", a);
//    }
