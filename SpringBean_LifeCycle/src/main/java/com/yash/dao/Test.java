package com.yash.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
//		ApplicationContext context=new ClassPathXmlApplicationContext("yash.xml");
//		UserDao2 bean = context.getBean(UserDao2.class);
//		bean.gettigdat();
//		ConfigurableApplicationContext cc=(ConfigurableApplicationContext)context;
//		cc.close();
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Confi.class);
		UserDao3 bean = context.getBean(UserDao3.class);
		bean.gettigdat();
		ConfigurableApplicationContext cc=(ConfigurableApplicationContext)context;
		cc.close();
	}

}
