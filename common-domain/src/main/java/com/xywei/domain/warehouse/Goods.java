package com.xywei.domain.warehouse;

import java.util.Date;

/**
 * @Author future
 * @DateTime 2021/2/26 11:48
 * @Description 仓库里面的商品
 */
public class Goods {
    private Integer id;
    private String goodsName;
    private String goodsDetail;
    private String goodsTotalNumber;
    private String goodsPrice;
    private Date createTime;
    private Date updateTime;

    public Goods() {
    }

    public Goods(Integer id, String goodsName, String goodsDetail, String goodsTotalNumber, String goodsPrice, Date createTime, Date updateTime) {
        this.id = id;
        this.goodsName = goodsName;
        this.goodsDetail = goodsDetail;
        this.goodsTotalNumber = goodsTotalNumber;
        this.goodsPrice = goodsPrice;
        this.createTime = createTime;
        this.updateTime = updateTime;
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

    public String getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

    public String getGoodsTotalNumber() {
        return goodsTotalNumber;
    }

    public void setGoodsTotalNumber(String goodsTotalNumber) {
        this.goodsTotalNumber = goodsTotalNumber;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", goodsDetail='" + goodsDetail + '\'' +
                ", goodsTotalNumber='" + goodsTotalNumber + '\'' +
                ", goodsPrice='" + goodsPrice + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
