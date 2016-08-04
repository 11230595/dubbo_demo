package com.hexun.yewu.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hexun.yewu.provider.DemoService;

public class Consumer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:D:/workspace-sts/DubboDemo-master/hexun-service-consumer/WebRoot/WEB-INF/dubbo-consumer.xml");
		context.start();
		DemoService demoService = (DemoService)context.getBean("demoService"); //从Dubbo获取服务
	    String hello = demoService.sayHello("world");  //调用函数
	    System.out.println(hello);
	}
}
