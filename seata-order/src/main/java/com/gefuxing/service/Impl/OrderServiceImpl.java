package com.gefuxing.service.Impl;

import com.gefuxing.domain.CommonResult;
import com.gefuxing.domain.Order;
import com.gefuxing.fenignClient.AccountFeign;
import com.gefuxing.fenignClient.StorageFeign;
import com.gefuxing.mapper.OrderMapper;
import com.gefuxing.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @Author gefuxing
 * @create 2021/6/14 13:06
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    public AccountFeign accountFeign;

    @Autowired
    public StorageFeign storageFeign;

    @Override
   @GlobalTransactional(name = "gfx-order",rollbackFor = Exception.class)
    public CommonResult getOrder(Long userId, Long productId, Integer count, BigDecimal money) {
        Order order = new Order();
        order.setUserId(userId);
        order.setProductId(productId);
        order.setCount(count);
        order.setMoney(money);
        orderMapper.insert(order);
        System.out.println("创建订单结束-------------------------");

        storageFeign.changeStorage(productId, count);
        System.out.println("修改库存结束-------------------------");

        accountFeign.getAccount(userId, money);
        System.out.println("修改账户金额结束-------------------------");
        orderMapper.update(order);
        return new CommonResult(200, "更新创建订单成功");

    }
}
