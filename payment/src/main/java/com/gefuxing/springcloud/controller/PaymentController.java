package com.gefuxing.springcloud.controller;

import com.gefuxing.springcloud.entities.CommonResult;
import com.gefuxing.springcloud.entities.Payment;
import com.gefuxing.springcloud.service.PaymentService;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Author gefuxing
 * @create 2021/4/5 19:59
 */
@Log4j2
@RestController
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String port;
    @GetMapping("/payment/{id}")
    public CommonResult getPayment(@PathVariable Long id) throws InterruptedException {
        Payment payment = paymentService.getPayment(id);

        return new CommonResult(200, "成功+port"+port,payment);
    }

    @PostMapping("/payment")
    public CommonResult postPayment(@RequestBody Payment payment) {
       int a= paymentService.postPayment(payment);
        return new CommonResult(200, "成功",a);
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("***** element:"+element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }


    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout(){
        try { TimeUnit.SECONDS.sleep(3); }catch (Exception e) {e.printStackTrace();}
        return port+"port";
    }

}
