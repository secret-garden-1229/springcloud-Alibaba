package com.benghai.springcloud.service;

import com.benghaui.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;


public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentbyId(@Param("id") Long id);

}
