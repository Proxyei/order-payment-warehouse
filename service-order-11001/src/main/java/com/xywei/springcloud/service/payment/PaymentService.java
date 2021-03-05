package com.xywei.springcloud.service.payment;

import com.xywei.domain.order.OrderDetail;

import java.math.BigDecimal;

public interface PaymentService {
    String payForOrder(OrderDetail orderDetail);
}
