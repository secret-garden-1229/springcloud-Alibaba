package com.benghai.springcloud.controller;



import com.benghai.springcloud.service.PaymentService;
import com.benghaui.springcloud.entities.CommonReslt;
import com.benghaui.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @auther zzyy
 * @create 2020-01-27 21:17
 */
@RestController
@Slf4j
public class PaymentController
{
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonReslt create(@RequestBody Payment payment)
    {
        int result = paymentService.create(payment);
        log.info("*****插入操作返回结果:" + result);

        if(result > 0)
        {
            return new CommonReslt(200,"插入数据库成功8002",result);
        }else{
            return new CommonReslt(444,"插入数据库失败8002",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonReslt<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        Payment payment = paymentService.getPaymentbyId(id);
        log.info("*****查询结果:{}",payment);
        if (payment != null) {
            return new CommonReslt(200,"查询成功8002",payment);
        }else{
            return new CommonReslt(444,"没有对应记录8002,查询ID: "+id,null);
        }
    }
}
 
 
