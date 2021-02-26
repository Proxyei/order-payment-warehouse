package com.xywei.domain.payment;

import java.util.Date;

/**
 * @Author future
 * @DateTime 2021/2/26 11:47
 * @Description
 */
public class Payment {
    private Integer id;
    private Integer orderId;
    /**
     * @Description '支付状态，2000-取消，2001-支付中，2002-支付完成',
     * @Author future
     * @DateTime 2021/2/26 11:54
     **/
    private Integer status;
    private Date createTime;

    public Payment() {
    }

    public Payment(Integer id, Integer orderId, Integer status, Date createTime) {
        this.id = id;
        this.orderId = orderId;
        this.status = status;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
                ", status=" + status +
                ", createTime=" + createTime +
                '}';
    }
}
