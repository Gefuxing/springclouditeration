package com.gefuxing.controller;

import com.gefuxing.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @Author gefuxing
 * @create 2021/5/13 13:06
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

//    @GetMapping("/payment/hystrix/ok/{id}")
//    public String paymentInfo_OK(@PathVariable("id") Integer id){
//        String result = paymentService.paymentInfo_OK(id);
//        log.info("*******result:"+result);
//        return result;
//    }
//    @GetMapping("/payment/hystrix/timeout/{id}")
//    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
//        String result = paymentService.paymentInfo_TimeOut(id);
//        log.info("*******result:"+result);
//        return result;
//    }
@GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(Integer id){
        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_OK,id：  "+id+"\t"+"哈哈哈"  ;
    }

    //失败
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")  //3秒钟以内就是正常的业务逻辑
    })
    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(Integer id){
        int timeNumber = 5;
      // int age = 10/0;
        try { TimeUnit.SECONDS.sleep(timeNumber); }catch (Exception e) {e.printStackTrace();}
        //return "线程池："+Thread.currentThread().getName()+"   paymentInfo_TimeOut,id：  "+id+"\t"+"呜呜呜"+" 耗时(秒)"+timeNumber;
        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_TimeOut,id：  "+id+"\t"+"呜呜呜"+" 耗时(秒)";
    }

    //兜底方法
    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池："+Thread.currentThread().getName()+"   系统繁忙, 请稍候再试  ,id：  "+id+"\t"+"哭了哇呜";
    }



    @GetMapping("/payment/hystrix/paymentCircuitBreaker/{id}")
    public String paymentCircuitBreaker(@PathVariable Integer id){
        return paymentService.paymentCircuitBreaker(id);
    }

}

