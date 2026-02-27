package com.yash.dao;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class UserDao3 {

	@PostConstruct
	public void init() {
		System.out.println("DB connection");
	}
	public void gettigdat() {
		System.out.println("Getting data from db");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Closing the db connection");
	}
}
