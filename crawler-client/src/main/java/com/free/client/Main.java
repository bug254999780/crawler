package com.free.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.free.clawler.user.api.v1.IDubboDemo;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("spring.xml");

        context.start ();

        IDubboDemo dubboDemo = (IDubboDemo)context.getBean ("dubboDemo");// 获取远程服务代理
        long begin=System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
//        	String hello = dubboDemo.sayHello("红红火火恍恍惚惚");
        	dubboDemo.sayHello("红红火火恍恍惚惚");
		}
        System.out.println(System.currentTimeMillis()-begin);
        
//        System.err.println (hello);// 显示调用结果
	}

}
