package com.xywei.springcloud.warehouse.controller;

import com.xywei.springcloud.warehouse.service.WareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author future
 * @DateTime 2021/2/28 17:04
 * @Description
 */
@RestController
public class WareHouseController {

    @Autowired
    private WareHouseService wareHouseService;

    @GetMapping("/")
    public String indexTest() {
        return "ok";
    }

    @GetMapping("/updateGoods/{id}/{goodsNumber}")
    public String updateWareHouseGoodsNumber(@PathVariable("id") int id, @PathVariable("goodsNumber") int goodsNumber) {
        int row = wareHouseService.updateWareHouseGoodsNumber(id, goodsNumber);
        return row > 0 ? "ok" : "error";
    }
}
