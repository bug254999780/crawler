package com.free.main;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();  
        context.load("classpath*:spring.xml");  
        context.refresh();
        Thread.sleep(999999999);
	}

}
