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
@FeignClient(value = "SERVICE-WAREHOUSE",fallback = OpenFeignWareHouseServiceFallback.class)
public interface OpenFeignWareHouseService {

    /**
     * @Description 更新仓库商品数量
     * @Author future
     * @DateTime 2021/3/6 16:25
     **/
    @GetMapping("/updateGoods/{id}/{goodsNumber}")
    String updateWareHouseGoodsNumber(@PathVariable("id") int id, @PathVariable("goodsNumber") int goodsNumber);
}
