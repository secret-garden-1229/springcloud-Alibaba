package com.benghuai.springcloud.controller;

import com.benghaui.springcloud.entities.CommonReslt;
import com.benghaui.springcloud.entities.Payment;
import com.benghuai.springcloud.service.Order80Feignservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignOrdeController80 {

    @Resource
    private Order80Feignservice order80Feignservice;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonReslt<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        return order80Feignservice.getPaymentById(id);
    }
}
