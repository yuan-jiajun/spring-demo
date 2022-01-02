package com.sankuai.yuan.service.impl;

import com.sankuai.yuan.beans.GenericResponse;
import com.sankuai.yuan.entity.UserEntity;
import com.sankuai.yuan.message.MessageSender;
import com.sankuai.yuan.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户服务实现类
 * Created by lidawei on 2017/5/21.
 */
@Service
public class UserServiceImpl implements UserService {
    public static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private MessageSender messageSender;

    @Override
    public GenericResponse add(UserEntity entity) {
        logger.info("创建的值：{}", entity);
        messageSender.add(entity.toString());
        return new GenericResponse();
    }

    @Override
    public GenericResponse remove(UserEntity entity) {
        logger.info("删除的值：{}", entity);
        return new GenericResponse();
    }

    @Override
    public GenericResponse update(UserEntity entity) {
        logger.info("更新的值：{}", entity);
        return new GenericResponse();
    }

    @Override
    public GenericResponse<UserEntity> queryUserInfoById(String userId) {
        logger.info("查询：{}", userId);
        messageSender.printAllQueueMessage();
        return new GenericResponse<UserEntity>();
    }
}
