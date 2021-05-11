package com.ge.controller;

import com.ge.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author gefuxing
 * @create 2021/5/11 11:10
 */
@RestController
public class consumeController {


    @Autowired
    private RestTemplate restTemplate;
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";
    @GetMapping("/consyme/{id}")
    public String get(@PathVariable Integer id) {
        return restTemplate.getForObject(PAYMENT_URL+"/payment/"+id, String.class);

    }
}
