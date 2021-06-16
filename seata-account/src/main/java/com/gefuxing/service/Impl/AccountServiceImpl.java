package com.gefuxing.service.Impl;

import com.gefuxing.domain.CommonResult;
import com.gefuxing.domain.Account;
import com.gefuxing.mapper.AccountMapper;
import com.gefuxing.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @Author gefuxing
 * @create 2021/6/14 13:06
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public CommonResult getAccount(Long userId, BigDecimal money) {
        accountMapper.update(userId, money);
        int a=1/0;

        return new CommonResult(200, "更新账户金额成功");
    }
}
