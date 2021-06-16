package com.gefuxing.conreoller;

import com.gefuxing.domain.CommonResult;
import com.gefuxing.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @Author gefuxing
 * @create 2021/6/14 13:05
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/getorder")
    public CommonResult getOrder(
            @RequestParam("userId") Long userId,
            @RequestParam("productId") Long productId,
            @RequestParam("count") Integer  count,
            @RequestParam("money") BigDecimal money) {
        return  orderService.getOrder(userId, productId, count, money);
    }
}
