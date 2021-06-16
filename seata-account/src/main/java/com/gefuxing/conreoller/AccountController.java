package com.gefuxing.conreoller;

import com.gefuxing.domain.CommonResult;
import com.gefuxing.service.AccountService;
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
public class AccountController {
    @Autowired
    private AccountService orderService;

    @GetMapping("/getaccount")
    public CommonResult getAccount(
            @RequestParam("userId") Long userId,
            @RequestParam("money") BigDecimal money) {
        return  orderService.getAccount(userId, money);
    }
}
