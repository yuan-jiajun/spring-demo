package com.sankuai.yuan.service.impl;

import com.sankuai.yuan.service.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    private HelloWorldService helloWorldService;

    private String serviceName;

    private String serviceNameV2;

/*    public HelloWorldServiceImpl() {
    }*/

    //在此处注入会造成循环依赖
    //Requested bean is currently in creation: Is there an unresolvable circular reference?
/*    @Bean
    public String serviceName() {
        return "MyServiceName";
    }*/

    //需要注入一个 类型为 String 的bean
    public HelloWorldServiceImpl(String serviceName) {
        this.serviceName = serviceName;
    }

    // Spring 内部是用反射来构建 Bean 的话，就不难发现问题所在：存在两个构造器，都可以调用时，到底应该调用哪个呢？
    // 最终 Spring 无从选择，只能尝试去调用默认构造器，而这个默认构造器又不存在，所以测试这个程序它会出错
    //解决方法，添加无参 构造器
/*    public HelloWorldServiceImpl(String serviceName, String serviceNameV2) {
        this.serviceName = serviceName;
        this.serviceNameV2 = serviceNameV2;
    }*/

    @Override
    public void sayHello() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello in HelloWorldService");
        }
    }
}
