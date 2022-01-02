/**
 * meituan.com Inc.
 * Copyright (c) 2010-2022 All Rights Reserved.
 */
package com.sankuai.yuan.inject.beans;

/**
 * <p>
 *
 * </p>
 *
 * @author yuanjiajun
 * @version String.java v1.0 2022/1/2 4:50 下午 yuan Exp $
 */
//这个bean装配给ServiceImpl的构造器参数“serviceName”

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class InjectBeans {
    @Bean
    public String serviceName() {
        return "MyServiceName";
    }
}