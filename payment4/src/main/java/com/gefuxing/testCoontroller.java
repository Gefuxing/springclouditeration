package com.gefuxing;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author gefuxing
 * @create 2021/5/11 16:58
 */
@RestController
@Slf4j
public class testCoontroller {

    @GetMapping("/payment/consul")
    public String payment (){
        return "test-consul";
    }
}
