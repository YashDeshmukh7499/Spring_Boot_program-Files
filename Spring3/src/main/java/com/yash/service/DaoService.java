package com.yash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.yash.dao.DaoReport;
@Service
public class DaoService {
	
@Autowired
@Qualifier("SQLReport")
	DaoReport dao;
	public void report() {
		dao.getreport();
		System.out.println("Report Generated....");
		
	}
	

}
