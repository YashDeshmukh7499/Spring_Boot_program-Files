package com.yash.dao.mpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.yash.dao.DaoReport;
@Repository("dao")
@Primary

public class OracleReport implements DaoReport{
@Override
public void getReport() {
	// TODO Auto-generated method stub
	System.out.println("Oracle Report is calling......");
	
}
}
