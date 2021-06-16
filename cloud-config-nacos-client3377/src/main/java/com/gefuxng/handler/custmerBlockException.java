package com.gefuxng.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

import java.util.concurrent.BlockingDeque;

/**
 * @Author gefuxing
 * @create 2021/6/12 11:30
 */
public  class custmerBlockException {

    public static String block1(String p1,String p2,BlockException  eption ) {
        return "用户自定义" ;

    }
    public static String fallback(String p1, String p2, Throwable e) {
        return "异长处理follback";
    }
}
