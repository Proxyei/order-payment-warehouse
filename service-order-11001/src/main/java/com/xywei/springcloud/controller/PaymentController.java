package com.xywei.springcloud.controller;

import com.xywei.domain.order.OrderDetail;
import com.xywei.domain.payment.Payment;
import com.xywei.springcloud.service.payment.PaymentService;
import com.xywei.springcloud.service.warehouse.WareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

/**
 * @Author future
 * @DateTime 2021/2/27 22:02
 * @Description
 */
@Controller
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private WareHouseService wareHouseService;

    @GetMapping("/payment")
    public String payForOrder(OrderDetail orderDetail, Model model) {

        String msg = paymentService.payForOrder(orderDetail);
        model.addAttribute("msg", msg);

        return "/warehouse/orderstatus";
    }

}
