package com.yash.dao;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserDao2 implements InitializingBean,DisposableBean {

//	public void init() {
//		System.out.println("DB connection");
//	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Db conn...");
		
	}
	public void gettigdat() {
		System.out.println("Getting data from db");
	}
	
	@Override
	public void destroy() {
		System.out.println("Closing the db connection");
	}
	

}
