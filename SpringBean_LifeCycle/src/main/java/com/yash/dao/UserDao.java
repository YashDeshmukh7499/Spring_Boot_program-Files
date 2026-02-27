package com.yash.dao;

public class UserDao  {
	
	public void init() {
		System.out.println("DB connection");
	}
	public void gettigdat() {
		System.out.println("Getting data from db");
	}
	public void destroy() {
		System.out.println("Closing the db connection");
	}

}
