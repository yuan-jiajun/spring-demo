/**
 * meituan.com Inc.
 * Copyright (c) 2010-2022 All Rights Reserved.
 */
package com.sankuai.yuan.controller;

import com.sankuai.yuan.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>
 *
 * </p>
 *
 * @author yuanjiajun
 * @version HelloController.java v1.0 2022/1/2 5:13 下午 yuan Exp $
 */

@Controller
public class HelloController {
    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String hello() {
        return "helloWorldService.sayHello()";
    }

}