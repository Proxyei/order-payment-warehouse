package com.xywei.springcloud.payment.service;

import com.xywei.domain.payment.Payment;

public interface PaymentService {
    int payForOrder(Payment payment);
}
