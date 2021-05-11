package com.ge.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author gefuxing
 * @create 2021/5/10 17:01
 */
@ApiModel(value = "com-gefuxing-springcloud-entities-Payment")
@Data
public class Payment {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "")
    private String serial;
}