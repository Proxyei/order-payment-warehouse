package com.xywei.springcloud.service.openfeign.payment;

import com.xywei.domain.payment.Payment;
import com.xywei.springcloud.service.openfeign.warehouse.OpenFeignWareHouseService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @Author future
 * @DateTime 2021/3/6 16:10
 * @Description 服务降级、服务熔断
 */
@Component(value = "openFeignPaymentService")
public class OpenFeignPaymentServiceFallback implements OpenFeignPaymentService {

    @Override
    public Payment payForOrder(Integer orderId, BigDecimal goodsTotalPrice, Integer goodsId) {
        return new Payment();
    }

    @Override
    public Payment payForOrderObject(Payment payment) {
        return new Payment();
    }

    @Override
    public Payment testSendObject(Payment payment) {
        return new Payment();
    }
}
