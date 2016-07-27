package com.free.main;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.free.user.mapper.BaseUserMapper;
import com.free.user.model.BaseUser;

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
        Thread.sleep(999999999);
	}

}
