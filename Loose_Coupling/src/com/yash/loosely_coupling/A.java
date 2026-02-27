package com.yash.loosely_coupling;

public class A {
	B bb;//Null value in there
	C cc;
	
	
//	public A(B bb, C cc) {
//		super();
//		this.bb = bb;
//		this.cc = cc;
//	}


	void add() {
		bb.add2();
		cc.add3();
	}


	public void setBb(B bb) {
		this.bb = bb;
	}


	public void setCc(C cc) {
		this.cc = cc;
	}

}
