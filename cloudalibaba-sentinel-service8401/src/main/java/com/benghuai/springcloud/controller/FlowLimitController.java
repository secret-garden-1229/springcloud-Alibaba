package com.benghuai.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.benghaui.springcloud.entities.CommonReslt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA()
    {
        return "------testA";
    }


    @GetMapping("/testB")
    public String testB()
    {
        return "------testB";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value ="testHotKey",blockHandler ="dealHandler_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2){
        return "------testHotKey";
    }



    public String dealHandler_testHotKey(String p1, String p2, BlockException exception)
    {
        return "-----dealHandler_testHotKey";
    }

    @GetMapping("/testHotKey2")
    @SentinelResource(value ="testHotKey2",blockHandlerClass = CustomerBlockHandler.class,blockHandler = "handleException")
    public CommonReslt testHotKey2(){
        return new CommonReslt(200,"FlowLimitController按客户自定义限流处理逻辑");
    }

}
