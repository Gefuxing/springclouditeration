package com.gefuxing.service;

import com.gefuxing.domain.CommonResult;

import java.math.BigDecimal;

/**
 * @Author gefuxing
 * @create 2021/6/14 13:06
 */
public interface OrderService {
    CommonResult getOrder(Long userId, Long productId, Integer count, BigDecimal money);
}
