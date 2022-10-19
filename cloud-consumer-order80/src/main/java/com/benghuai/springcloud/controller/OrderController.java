package com.benghuai.springcloud.controller;


import com.benghaui.springcloud.entities.CommonReslt;
import com.benghaui.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderController {

    private  final  static  String  PATH="http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create") //客户端用浏览器是get请求，但是底层实质发送post调用服务端8001
    public CommonReslt create(Payment payment)
    {
        return restTemplate.postForObject(PATH + "/payment/create",payment, CommonReslt.class);
    }


    @GetMapping("/consumer/payment/get/{id}")
    public CommonReslt getPayment(@PathVariable Long id)
    {
        return restTemplate.getForObject(PATH + "/payment/get/"+id, CommonReslt.class, id);
    }

    @GetMapping("/consumer/payment/zipkin")
    public String paymentZipkin()
    {
        String result = restTemplate.getForObject(PATH+"/payment/zipkin/", String.class);
        return result;
    }


}
