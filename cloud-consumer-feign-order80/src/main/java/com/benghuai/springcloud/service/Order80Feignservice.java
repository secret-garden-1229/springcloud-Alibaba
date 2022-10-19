package com.benghuai.springcloud.service;

import com.benghaui.springcloud.entities.CommonReslt;
import com.benghaui.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface Order80Feignservice {
    @GetMapping(value = "/payment/get/{id}")
    CommonReslt<Payment> getPaymentById(@PathVariable("id") Long id);

}
