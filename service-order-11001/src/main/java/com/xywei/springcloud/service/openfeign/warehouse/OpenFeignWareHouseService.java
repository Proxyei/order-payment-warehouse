package com.xywei.springcloud.service.openfeign.warehouse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author future
 * @DateTime 2021/2/27 22:27
 * @Description
 */
@Component(value = "openFeignWareHouseService")
@FeignClient(value = "SERVICE-WAREHOUSE")
public interface OpenFeignWareHouseService {

    @GetMapping("/updateGoods/{id}/{goodsNumber}")
    String updateWareHouseGoodsNumber(@PathVariable("id") int id, @PathVariable("goodsNumber") int goodsNumber);
}
