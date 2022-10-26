package com.benghuai.springcloud.servcie;


import com.benghuai.springcloud.domain.Order;

public interface OrderService {


    /**
     * 创建订单
     */
    void create(Order order);

}
