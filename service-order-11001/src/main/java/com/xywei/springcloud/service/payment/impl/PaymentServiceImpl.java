package com.xywei.springcloud.service.payment.impl;

import com.xywei.domain.order.OrderDetail;
import com.xywei.domain.payment.Payment;
import com.xywei.springcloud.service.openfeign.payment.OpenFeignPaymentService;
import com.xywei.springcloud.service.openfeign.warehouse.OpenFeignWareHouseService;
import com.xywei.springcloud.service.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author future
 * @DateTime 2021/3/5 14:52
 * @Description
 */
@Service(value = "paymentService")
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private OpenFeignPaymentService openFeignPaymentService;

    @Autowired
    private OpenFeignWareHouseService openFeignWareHouseService;

    @Override
    public String payForOrder(OrderDetail orderDetail) {
        String msg = null;
        StringBuffer sb = new StringBuffer();
        //调用支付系统，如果支付系统OK，就调用仓库系统
        Payment payment = new Payment();
        payment.setOrderId(orderDetail.getOrderId());
        payment.setTotalPrice(orderDetail.getGoodsTotalPrice());
        //完成支付
        Payment pay = openFeignPaymentService.payForOrder(orderDetail.getOrderId(), orderDetail.getGoodsTotalPrice(), orderDetail.getGoodsId());

        System.out.println("当前支付的订单信息：" + orderDetail.getOrderId() + ", " + orderDetail.getGoodsTotalPrice());

        //如果支付OK，就进行库存货物减少
        if (pay != null && pay.getId() != null) {

            sb.append("payment调用：");
            sb.append(pay.getPort());

            msg = openFeignWareHouseService.updateWareHouseGoodsNumber(orderDetail.getGoodsId(), orderDetail.getGoodsTotalNumber());

            if (msg !=null && msg.contains("ok")) {
                sb.append(", warehouse调用：");
            }else {
                sb.append(", 仓库服务降级：");
            }
            sb.append(msg);

        } else {
            sb.append("支付服务出现异常");
        }


        return sb.toString();
    }
}
