/**
 * meituan.com Inc.
 * Copyright (c) 2010-2022 All Rights Reserved.
 */
package com.sankuai.yuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @GetMapping(value = "/hello")
    public @ResponseBody
    String hello() {
        return "hello String";
    }

}