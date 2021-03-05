package com.xywei.springcloud.warehouse.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WareHouseDao {
    int updateWareHouseGoodsNumber(@Param("id") int id, @Param("goodsNumber") int goodsNumber);
}
