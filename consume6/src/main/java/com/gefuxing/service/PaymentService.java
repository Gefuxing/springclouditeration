package com.gefuxing.service;

//import com.gefuxing.springcloud.entities.CommonResult;
//import org.springframework.cloud.openfeign.FeignClient;
import com.gefuxing.entities.CommonResult;
import com.gefuxing.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author gefuxing
 * @create 2021/5/12 18:14
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentService {
    @GetMapping("/payment/{id}")
    public CommonResult getPayment(@PathVariable(value = "id") Long id);

}
