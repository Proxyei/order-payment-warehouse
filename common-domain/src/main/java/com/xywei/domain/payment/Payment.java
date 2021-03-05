package com.xywei.domain.payment;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author future
 * @DateTime 2021/2/26 11:47
 * @Description
 */
public class Payment {
    private Integer id;
    private Integer orderId;
    private BigDecimal totalPrice;
    private Date createTime;

    public Payment() {
    }

    public Payment(Integer id, Integer orderId, BigDecimal totalPrice, Date createTime) {
        this.id = id;
        this.orderId = orderId;
        this.totalPrice = totalPrice;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", totalPrice=" + totalPrice +
                ", createTime=" + createTime +
                '}';
    }
}
