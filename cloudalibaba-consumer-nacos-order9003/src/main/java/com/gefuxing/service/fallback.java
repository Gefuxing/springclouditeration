package com.gefuxing.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author gefuxing
 * @create 2021/6/8 14:41
 */
@Component
public class fallback  implements service3377{

    public String get() {
        return "fallback";
    }

    @Override
    public String testc(String p1, String p2) {
        return "fallback";
    }
}
