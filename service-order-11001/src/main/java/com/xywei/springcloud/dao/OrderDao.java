package com.xywei.springcloud.dao;

import com.xywei.domain.order.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author future
 * @DateTime 2021/2/26 17:10
 * @Description
 */
@Mapper
public interface OrderDao {
    int orderCreate(Order order);
}
