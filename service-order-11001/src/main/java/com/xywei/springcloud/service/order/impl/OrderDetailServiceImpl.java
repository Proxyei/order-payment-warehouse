package com.xywei.springcloud.service.order.impl;

import com.xywei.domain.order.OrderDetail;
import com.xywei.springcloud.dao.OrderDetailDao;
import com.xywei.springcloud.service.order.OrderDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author future
 * @DateTime 2021/2/27 15:09
 * @Description
 */
@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Resource
    private OrderDetailDao orderDetailDao;

    @Override
    public int orderDetailCreate(OrderDetail orderDetail) {
        return orderDetailDao.orderDetailCreate(orderDetail);
    }
}
