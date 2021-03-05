package com.xywei.springcloud.service.order.impl;

import com.xywei.domain.constant.CommonConstant;
import com.xywei.domain.order.Order;
import com.xywei.domain.order.OrderDetail;
import com.xywei.domain.order.OrderVO;
import com.xywei.springcloud.dao.OrderDao;
import com.xywei.springcloud.service.order.OrderDetailService;
import com.xywei.springcloud.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author future
 * @DateTime 2021/2/26 17:08
 * @Description
 */
@Service
public class OrderServiceImpl implements OrderService {

    //@Autowired idea会报错

    @Autowired
    private OrderDetailService orderDetailService;

    @Resource
    private OrderDao orderDao;

    @Override
    public OrderDetail orderCreate(OrderVO orderVO) {

        //插入下单记录
        Order order = new Order();
        //待支付，支付中
        order.setStatus(CommonConstant.ORDER_STATUS_PAYING);
        order.setTotalPrice(orderVO.getGoodsTotalPrice());
        int row = orderDao.orderCreate(order);
        System.out.println("订单记录" + row);

        OrderDetail orderDetail = new OrderDetail();
        //订单详细插入记录，订单id，商品id，商品名字，商品总数量，商品总价格
        if (row > 0) {
            orderDetail.setOrderId(order.getId());
            orderDetail.setGoodsId(orderVO.getId());
            orderDetail.setGoodsName(orderVO.getGoodsName());
            orderDetail.setGoodsTotalNumber(orderVO.getGoodsNumber());
            orderDetail.setGoodsTotalPrice(orderVO.getGoodsTotalPrice());
            int orderDetailRow = orderDetailService.orderDetailCreate(orderDetail);
            System.out.println("订单详细" + orderDetailRow);

        }
        return orderDetail;
    }
}
