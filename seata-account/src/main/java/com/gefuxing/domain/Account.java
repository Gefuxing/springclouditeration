package com.gefuxing.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account
{
    private Long id;

    private Long userId;



    private BigDecimal total;
    private BigDecimal used;
    private BigDecimal residue;

    private Integer status; //订单状态：0：创建中；1：已完结
}

