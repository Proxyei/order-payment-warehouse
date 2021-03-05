package com.xywei.springcloud.controller;

import com.xywei.springcloud.service.openfeign.warehouse.OpenFeignWareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author future
 * @DateTime 2021/2/28 18:24
 * @Description 暂时没有用到 test for feign
 */
@RestController
public class WareHouseController {

    @Autowired
    private OpenFeignWareHouseService openFeignWareHouseService;


    /**
     * @Description id=商品的id编号，goodsNumber=商品在仓库中的剩余数量
     * @Author future
     * @DateTime 2021/2/28 23:18
     **/
    @GetMapping("/updateGoods/{id}/{goodsNumber}")
    public String updateWareHouseGoodsNumber(@PathVariable("id") int id, @PathVariable("goodsNumber") int goodsNumber) {
        return openFeignWareHouseService.updateWareHouseGoodsNumber(id, goodsNumber);
    }
}
