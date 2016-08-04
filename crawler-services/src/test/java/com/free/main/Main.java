package com.free.main;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();  
        context.load("classpath*:spring.xml");  
        context.refresh();
//        SqlSessionTemplate ss=  (SqlSessionTemplate) context.getBean("SqlSessionTemplate");
       // BaseUserMapper bum=context.getBean();
        //BaseUser bu= bum.selectByPrimaryKey(1L);
        //List<Object> list= ss.selectList("select * from base_user");
        //System.out.println(bu.toString());
        System.out.println("api  init... ");
        Thread.sleep(999999999);
	}

}
