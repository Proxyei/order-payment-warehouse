package com.xywei.springcloud.controller;

import com.xywei.domain.order.OrderDetail;
import com.xywei.domain.order.OrderVO;
import com.xywei.springcloud.service.order.OrderDetailService;
import com.xywei.springcloud.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author future
 * @DateTime 2021/2/26 16:15
 * @Description
 */
@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderDetailService orderDetailService;

    /**
     * @Description 下单主页
     * @Author future
     * @DateTime 2021/2/27 10:44
     **/
    @GetMapping("/")
    public String index() {
        return "order/index";
    }

    @PostMapping("/order/create")
    public String orderCreate(OrderVO orderVO, Model model) {

        //订单插入记录，总价格，订单状态
        OrderDetail orderDetail = orderService.orderCreate(orderVO);
        model.addAttribute("orderDetail", orderDetail);

        return "payment/orderList";

    }


}
