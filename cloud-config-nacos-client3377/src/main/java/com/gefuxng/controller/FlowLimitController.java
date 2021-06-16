package com.gefuxng.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.gefuxng.handler.custmerBlockException;
import com.gefuxng.handler.custmerBlockExceptionfallback;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowLimitController {
    @GetMapping("/testA")
    public String testA() {
        int a = 1 / 0;
        return "------testA";
    }

    @GetMapping("/testc")
    @SentinelResource(value = "testc",
            blockHandlerClass = custmerBlockException.class,
            blockHandler = "block1",
            fallbackClass = custmerBlockException.class,
            fallback = "fallback"

    )
    public String testc(@RequestParam(value = "p1", required = false) String p1,
                        @RequestParam(value = "p2", required = false) String p2
    ) {
        //int a = 1 / 0;
        return "------testc";
    }

    @GetMapping("/testB")
    public String testB() {

        return "------testB";
    }


    public String deal_testc(String p1, String p2, BlockException b) {
        return "热点话题限流";
    }





    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2) {
        //int age = 10/0;
        return "------testHotKey";
    }

    //兜底方法
    public String deal_testHotKey(String p1, String p2, BlockException exception) {
        return "------deal_testHotKey,o(╥﹏╥)o";
    }


}