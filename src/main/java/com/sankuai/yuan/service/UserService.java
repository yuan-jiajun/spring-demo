package com.sankuai.yuan.service;

import com.sankuai.yuan.model.GenericResponse;
import com.sankuai.yuan.entity.UserEntity;

/**
 * 用户管理功能服务层
 * Created by lidawei on 2017/5/21.
 */
public interface UserService {
    GenericResponse add(UserEntity entity);

    GenericResponse remove(UserEntity entity);

    GenericResponse update(UserEntity entity);

    GenericResponse<UserEntity> queryUserInfoById(String userId);
}
