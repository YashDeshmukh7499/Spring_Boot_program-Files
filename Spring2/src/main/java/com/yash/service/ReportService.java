package com.yash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.yash.Conf;
import com.yash.dao.DaoReport;

public class ReportService {
	@Autowired
	@Qualifier("yash")
	DaoReport dao;
	
	public void getreport() {
		dao.getReport();
		System.out.println("report is generated.....");
	}
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Conf.class);
		DaoReport bean = context.getBean(DaoReport.class);
	     bean.getReport();
	}

}
