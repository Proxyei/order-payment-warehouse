package com.xywei.domain.order;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author future
 * @DateTime 2021/2/26 11:32
 * @Description 一个订单对应多个订单详细
 */
public class Order {
    /**
     * @Description 订单id
     * @Author future
     * @DateTime 2021/2/26 11:39
     **/
    private Integer id;
    /**
     * @Description 订单总价格
     * @Author future
     * @DateTime 2021/2/26 11:39
     **/
    private BigDecimal totalPrice;
    /**
     * @Description 订单状态， '订单状态：1000-取消，10001-支付中，1002-支付完成，1003-出库中，10004-配送中，1005-订单完成',
     * @Author future
     * @DateTime 2021/2/26 11:38
     **/
    private Integer status;
    /**
     * @Description 订单创建时间
     * @Author future
     * @DateTime 2021/2/26 11:39
     **/
    private Date createTime;
    /**
     * @Description 订单完成时间
     * @Author future
     * @DateTime 2021/2/26 11:39
     **/
    private Date finishTime;

    public Order() {
    }

    public Order(Integer id, BigDecimal totalPrice, Integer status, Date createTime, Date finishTime) {
        this.id = id;
        this.totalPrice = totalPrice;
        this.status = status;
        this.createTime = createTime;
        this.finishTime = finishTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
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

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    @Override
    public String toString() {
        return "order{" +
                "id=" + id +
                ", totalPrice=" + totalPrice +
                ", status=" + status +
                ", createTime=" + createTime +
                ", finishTime=" + finishTime +
                '}';
    }
}
