package com.xywei.domain.order;

import java.math.BigDecimal;

/**
 * @Author future
 * @DateTime 2021/2/26 11:40
 * @Description 订单详细
 */
public class OrderDetail {

    private Integer id;
    private Integer orderId;
    private Integer goodsId;
    private String goodsName;
    private Integer goodsTotalNumber;
    private BigDecimal goodsTotalPrice;

    public OrderDetail() {
    }

    public OrderDetail(Integer id, Integer orderId, Integer goodsId, String goodsName, Integer goodsTotalNumber, BigDecimal goodsTotalPrice) {
        this.id = id;
        this.orderId = orderId;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsTotalNumber = goodsTotalNumber;
        this.goodsTotalPrice = goodsTotalPrice;
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

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getGoodsTotalNumber() {
        return goodsTotalNumber;
    }

    public void setGoodsTotalNumber(Integer goodsTotalNumber) {
        this.goodsTotalNumber = goodsTotalNumber;
    }

    public BigDecimal getGoodsTotalPrice() {
        return goodsTotalPrice;
    }

    public void setGoodsTotalPrice(BigDecimal goodsTotalPrice) {
        this.goodsTotalPrice = goodsTotalPrice;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsTotalNumber=" + goodsTotalNumber +
                ", goodsTotalPrice=" + goodsTotalPrice +
                '}';
    }
}

