package com.ztw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ztw.Service.ServiceTest;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
		ServiceTest serviceTest = (ServiceTest) context.getBean("serviceTest");
		serviceTest.test();
	}

}
