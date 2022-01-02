package com.sankuai.yuan.service;

import com.sankuai.yuan.model.GenericResponse;
import com.sankuai.yuan.entity.GoodsEntity;

import java.util.List;

/**
 * 商品管理功能服务层
 * Created by lidawei on 2017/5/21.
 */
public interface GoodsService {
    GenericResponse add(GoodsEntity entity);

    GenericResponse remove(GoodsEntity entity);

    GenericResponse update(GoodsEntity entity);

    GenericResponse<List<GoodsEntity>> queryByName(String goodsName);
}
