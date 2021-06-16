package com.gefuxing.com;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author gefuxing
 * @create 2021/5/13 13:06
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "paymentTimeOutFallbackMethod")         //默认降级
public class PaymentController {

    @Resource
    private PaymentServiceClient paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_OK(id);
        log.info("*******result:"+result);
        return result;
    }
//    @GetMapping("/payment/hystrix/timeout/{id}")
//    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
//        String result = paymentService.paymentInfo_TimeOut(id);
//        log.info("*******result:"+result);
//        return result;
//    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
//    @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod1",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")  //3秒钟以内就是正常的业务逻辑
//    })
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_TimeOut(id);
        return result;
    }

    //兜底方法
    public String paymentTimeOutFallbackMethod(@PathVariable("id") Integer id){
        return "我是消费者80，对付支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己,(┬＿┬)";
    }


    //兜底方法
    public String paymentTimeOutFallbackMethod1(@PathVariable("id") Integer id){
        return "我是消费者80-----1，对付支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己,(┬＿┬)";
    }
}

