package com.xywei.springcloud.dao;

import com.xywei.domain.order.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author future
 * @DateTime 2021/2/26 17:10
 * @Description
 */
@Mapper
public interface OrderDetailDao {
    int orderDetailCreate(OrderDetail orderDetail);
}
