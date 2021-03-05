package com.xywei.springcloud.service.order;

import com.xywei.domain.order.Order;
import com.xywei.domain.order.OrderDetail;
import com.xywei.domain.order.OrderVO;

/**
 * @Author future
 * @DateTime 2021/2/26 17:06
 * @Description
 */
public interface OrderService {
    OrderDetail orderCreate(OrderVO orderVo);
}
