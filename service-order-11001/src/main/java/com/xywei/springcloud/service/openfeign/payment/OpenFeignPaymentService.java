package com.xywei.springcloud.service.openfeign.payment;

import com.xywei.domain.order.OrderDetail;
import com.xywei.domain.payment.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * @Author future
 * @DateTime 2021/2/28 22:30
 * @Description
 */
@Component(value = "openFeignPaymentService")
@FeignClient(value = "SERVICE-PAYMENT")
public interface OpenFeignPaymentService {

    //TODO 这里卡住很久，传递对象的时候问题很大！,但是后面下又能用了，真神了！
    //参数不一定要相同也行？先留着，慢慢发现
    @GetMapping("/payment")
    Payment payForOrder(@RequestParam("orderId") Integer orderId,
                               @RequestParam("goodsTotalPrice") BigDecimal goodsTotalPrice,
                               @RequestParam("goodsId") Integer goodsId);
    @PostMapping("/payment2")
    Payment payForOrderObject(@RequestBody Payment payment);


    @PostMapping("/test/payment")
    Payment testSendObject( Payment payment);
}
