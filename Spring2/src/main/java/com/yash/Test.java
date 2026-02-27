package com.yash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		//IOC is Started
		ApplicationContext context=new AnnotationConfigApplicationContext(Conf.class);
	}

}
