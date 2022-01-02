package com.sankuai.yuan.service.impl;

import com.sankuai.yuan.beans.GenericResponse;
import com.sankuai.yuan.entity.GoodsEntity;
import com.sankuai.yuan.message.MessageSender;
import com.sankuai.yuan.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品管理服务实现类
 * Created by lidawei on 2017/5/21.
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    private static final Logger logger = LoggerFactory.getLogger(GoodsServiceImpl.class);

    @Autowired
    private MessageSender messageSender;

    @Override
    public GenericResponse add(GoodsEntity entity) {
        logger.info("创建的值：{}", entity);
        messageSender.add(entity.toString());
        return new GenericResponse();
    }

    @Override
    public GenericResponse remove(GoodsEntity entity) {
        logger.info("删除的值：{}", entity);
        return new GenericResponse();
    }

    @Override
    public GenericResponse update(GoodsEntity entity) {
        logger.info("更新的值：{}", entity);
        return new GenericResponse();
    }

    @Override
    public GenericResponse<List<GoodsEntity>> queryByName(String goodsName) {
        logger.info("查询：{}", goodsName);
        messageSender.printAllQueueMessage();
        return new GenericResponse<List<GoodsEntity>>();
    }
}
