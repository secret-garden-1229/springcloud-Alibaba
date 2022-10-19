package com.benghai.springcloud.service.imp;


import com.benghai.springcloud.dao.PaymentDao;

import com.benghai.springcloud.service.PaymentService;
import com.benghaui.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auther zzyy
 * @create 2020-01-27 21:12
 */
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentbyId(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
 
 
