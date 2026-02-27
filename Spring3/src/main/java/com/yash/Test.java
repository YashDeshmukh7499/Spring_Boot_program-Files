package com.yash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.yash.dao.DaoReport;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Confi.class);
		DaoReport bean = context.getBean(DaoReport.class);
		bean.getreport();
	}

}
