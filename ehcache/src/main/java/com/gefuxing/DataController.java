package com.gefuxing;

import com.gefuxing.model.student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;

/**
 * @Author gefuxing
 * @create 2021/6/16 16:32
 */

@RestController
@Slf4j
public class DataController {

    /**
     * 模拟数据库
     */

    private static final String str="gfx" ;

    /**
     * 初始化数据
     */

    @GetMapping("/get/{id}")
    @Cacheable(value = "user", key = "#id")
    public String get(@PathVariable Integer id) {
        log.info("走数据库__________________________________");
        String s = str;
        return s;
    }
}
