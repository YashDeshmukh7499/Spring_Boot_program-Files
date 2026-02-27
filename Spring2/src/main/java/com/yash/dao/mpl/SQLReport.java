package com.yash.dao.mpl;

import org.springframework.stereotype.Repository;

import com.yash.dao.DaoReport;
@Repository("yash")

public class SQLReport implements DaoReport {
@Override

public void getReport() {
	System.out.println("SQLReport is calling.....");
	
}
}
