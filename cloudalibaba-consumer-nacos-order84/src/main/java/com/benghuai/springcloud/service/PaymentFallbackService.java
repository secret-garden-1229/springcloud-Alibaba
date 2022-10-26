package com.benghuai.springcloud.service;


import com.benghaui.springcloud.entities.CommonReslt;
import com.benghaui.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @auther zzyy
 * @create 2020-02-25 18:30
 */
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonReslt<Payment> paymentSQL(Long id)
    {
        return new CommonReslt<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
