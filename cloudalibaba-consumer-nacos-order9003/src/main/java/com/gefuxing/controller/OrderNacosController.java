package com.gefuxing.controller;

import com.gefuxing.service.service3377;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author gefuxing
 * @create 2021/6/8 14:42
 */
@RestController
@Slf4j
public class OrderNacosController
{
    @Resource
    private RestTemplate restTemplate;

    //@Value("${service-url.nacos-user-service}")
    private String serverURL;

    @Resource
    private service3377 service33771;

    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(serverURL+"/payment/nacos/"+id,String.class);
    }

    @GetMapping(value = "/fallback/{id}")
    public String paymentInfo1(@PathVariable("id") String id)
    {

        String testc = service33771.testc(id, null);
        return testc;
        //return restTemplate.getForObject(serverURL+"/testc/"+id,String.class);
    }
}
