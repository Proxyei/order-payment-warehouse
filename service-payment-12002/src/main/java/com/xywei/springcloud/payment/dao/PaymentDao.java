package com.xywei.springcloud.payment.dao;

import com.xywei.domain.payment.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author future
 * @DateTime 2021/2/27 23:11
 * @Description
 */
@Mapper
public interface PaymentDao {
    int payForOrder(Payment payment);
}
