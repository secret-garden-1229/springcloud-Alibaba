package com.benghuai.springcloud.service.imp;

import com.benghuai.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return null;
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return null;
    }
}
