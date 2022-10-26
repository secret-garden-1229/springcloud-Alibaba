package com.benghuai.springcloud.controller;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.benghaui.springcloud.entities.CommonReslt;


public class CustomerBlockHandler {

    public static CommonReslt handleException(BlockException exception){
        return new CommonReslt(2020,"自定义的限流处理信息......CustomerBlockHandler");
    }

}
