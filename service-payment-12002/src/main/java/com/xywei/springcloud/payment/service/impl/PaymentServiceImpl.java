package com.xywei.springcloud.payment.service.impl;

import com.xywei.domain.payment.Payment;
import com.xywei.springcloud.payment.dao.PaymentDao;
import com.xywei.springcloud.payment.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author future
 * @DateTime 2021/2/27 23:11
 * @Description
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int payForOrder(Payment payment) {
        return paymentDao.payForOrder(payment);
    }
}
