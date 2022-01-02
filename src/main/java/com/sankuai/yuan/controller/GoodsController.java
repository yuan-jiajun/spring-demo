package com.sankuai.yuan.controller;

import com.sankuai.yuan.model.GenericResponse;
import com.sankuai.yuan.entity.GoodsEntity;
import com.sankuai.yuan.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品类前端接口控制器
 * Created by lidawei on 2017/5/21.
 */
@Controller
@RequestMapping(value = "/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    GenericResponse add(@RequestBody GoodsEntity entity) {
        return goodsService.add(entity);
    }

    @RequestMapping(value = "/remove", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    GenericResponse remove(@RequestBody GoodsEntity entity) {
        return goodsService.remove(entity);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    GenericResponse update(@RequestBody GoodsEntity entity) {
        return goodsService.update(entity);
    }

    @RequestMapping(value = "/queryByName", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    GenericResponse queryByName(String goodsName) {
        return goodsService.queryByName(goodsName);
    }
}
