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
public class OpenFeignWareHouseServiceFallback implements  OpenFeignWareHouseService{

    @Override
    public String updateWareHouseGoodsNumber(int id, int goodsNumber) {
        return "仓库服务异常";
    }
}
