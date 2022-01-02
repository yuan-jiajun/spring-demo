package com.sankuai.yuan.service.impl;

import com.sankuai.yuan.service.HelloWorld;

/**
 * HelloWorld 服务
 * Created by lidawei on 2017/4/5.
 */
public class HelloWorldService {
    private HelloWorld helloWorld;

    private String serviceName;

    public HelloWorldService() {
    }

    public HelloWorldService(String serviceName) {
        this.serviceName = serviceName;
    }

    public HelloWorld getHelloWorld() {
        return helloWorld;
    }

    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }
}
