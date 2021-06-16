package com.gefuxng.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @Author gefuxing
 * @create 2021/6/12 11:30
 */
public  class custmerBlockExceptionfallback {

    public String fallback(String p1, String p2, Throwable e) {
        return "异长处理follback";
    }
}
