package com.xywei.domain.order;

import java.math.BigDecimal;

/**
 * @Author future
 * @DateTime 2021/2/27 12:56
 * @Description
 */
public class OrderVO {
    private Integer id;
    private String goodsName;
    private BigDecimal goodsPrice;
    private Integer goodsNumber;
    private BigDecimal goodsTotalPrice;

    public OrderVO() {
    }

    public OrderVO(Integer id, String goodsName, BigDecimal goodsPrice, Integer goodsNumber, BigDecimal goodsTotalPrice) {
        this.id = id;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsNumber = goodsNumber;
        this.goodsTotalPrice = goodsTotalPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public BigDecimal getGoodsTotalPrice() {
        return goodsTotalPrice;
    }

    public void setGoodsTotalPrice(BigDecimal goodsTotalPrice) {
        this.goodsTotalPrice = goodsTotalPrice;
    }

    @Override
    public String toString() {
        return "OrderVO{" +
                "id=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsNumber=" + goodsNumber +
                ", goodsTotalPrice=" + goodsTotalPrice +
                '}';
    }
}
