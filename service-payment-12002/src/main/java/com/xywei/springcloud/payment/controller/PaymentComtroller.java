package com.xywei.springcloud.payment.controller;

import com.xywei.domain.payment.Payment;
import com.xywei.springcloud.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author future
 * @DateTime 2021/2/27 22:27
 * @Description
 */
@RestController
public class PaymentComtroller {

    @Value("${server.port}")
    private int serverPort;

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment")
    public Payment payForOrder(Integer orderId, BigDecimal goodsTotalPrice){

        Payment payment=new Payment();
        payment.setOrderId(orderId);
        payment.setTotalPrice(goodsTotalPrice);
        payment.setPort(serverPort);
        System.out.println("payment=="+payment);
        paymentService.payForOrder(payment);

        return payment;
    }


    @PostMapping("/payment2")
    public Payment payForOrderObject2(@RequestBody Payment payment){
        System.out.println("payment=="+payment);
        paymentService.payForOrder(payment);

        return payment;
    }
    @PostMapping("/test/payment")
//    public Payment testObject(Payment payment){
    public Payment testObject(@RequestBody Payment payment){
        System.out.println("===payment project=== "+payment);
        payment.setCreateTime(new Date());
        return payment;
    }
}
