package com.gefuxing.mapper;

import com.gefuxing.domain.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author gefuxing
 * @create 2021/6/14 13:02
 */
@Mapper
public interface OrderMapper {

    void insert(Order order);

    void update(Order order);
}
