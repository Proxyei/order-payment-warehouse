package com.xywei.test;

import com.xywei.domain.payment.Payment;
import com.xywei.springcloud.OrderApplication11001;
import com.xywei.springcloud.service.payment.PaymentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author future
 * @DateTime 2021/3/1 13:52
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OrderApplication11001.class)
public class TestPayment {
    @Autowired
    private PaymentService paymentService;

}
