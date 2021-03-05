package com.xywei.springcloud.warehouse.service.impl;

import com.xywei.springcloud.warehouse.dao.WareHouseDao;
import com.xywei.springcloud.warehouse.service.WareHouseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author future
 * @DateTime 2021/2/28 17:05
 * @Description
 */
@Service
public class WareHouseServiceImpl implements WareHouseService {

    @Resource
    private WareHouseDao wareHouseDao;

    @Override
    public int updateWareHouseGoodsNumber(int id, int goodsNumber) {
        return wareHouseDao.updateWareHouseGoodsNumber(id, goodsNumber);
    }
}
