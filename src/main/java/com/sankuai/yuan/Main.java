package com.sankuai.yuan;

import com.sankuai.yuan.service.impl.HelloWorldServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * HelloWorld 应用程序
 * Created by lidawei on 2017/4/5.
 */
public class Main {
    public static void main(String[] args) {
        //        doMain_knights();
        doMain_spring();
    }

    private static void doMain_spring() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-mvc.xml");
        HelloWorldServiceImpl helloWorldService = (HelloWorldServiceImpl) context.getBean("helloWorldService");
        helloWorldService.sayHello();
        context.close();
    }
}
