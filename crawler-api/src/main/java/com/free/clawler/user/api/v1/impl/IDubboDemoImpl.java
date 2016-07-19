package com.free.clawler.user.api.v1.impl;

import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import com.free.clawler.user.api.v1.IDubboDemo;
@Service(value = "provideService")
public class IDubboDemoImpl implements IDubboDemo {

	@Override
	public String sayHello(String name) {
		DateTime dt1 = new DateTime();// 取得当前时间 
		System.out.println(name);
		return name+"现在是"+dt1.toString();
	}

}
