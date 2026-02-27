package com.yash.dao.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.yash.dao.DaoReport;
@Repository("dao")
public class OracleReport implements DaoReport{
@Override
	public void getreport() {
		// TODO Auto-generated method stub
	
	System.out.println("Get report from oralceReport...");
		
	}

}
