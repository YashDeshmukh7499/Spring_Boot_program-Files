package com.yash.loosely_coupling;

public class Test {
	public static void main(String[] args) {
//		A a=new A(new B(),new C()); // Constructor Level Injection
//		a.bb=new B();  Field Injection
//		a.cc=new C();
		A a=new A();
//		a.setBb(new B());
//		a.setCc(new C());  setter level Injection
		
		a.add();
	}
}
