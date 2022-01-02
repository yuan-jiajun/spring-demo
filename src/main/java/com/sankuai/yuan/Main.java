package com.sankuai.yuan;

import com.sankuai.yuan.service.IKnight;
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

    private static void doMain_knights() {
        // Main、main这个方法、乃至doMain这个方法，都根本不知道执行探险任务的到底是哪个类
        // 他们仅仅是从knights.xml中加载应用程序的上下文，然后调用embarkOnQuest方法即可，他们甚至不知道BraveKnight的存在

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        IKnight knight = (IKnight) context.getBean("knight");
        knight.embarkOnQuest();
        context.close();
    }

    private static void doMain_spring() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-mvc.xml");
        HelloWorldServiceImpl helloWorldService = (HelloWorldServiceImpl) context.getBean("helloWorldService");
        helloWorldService.sayHello();
        context.close();
    }
}
