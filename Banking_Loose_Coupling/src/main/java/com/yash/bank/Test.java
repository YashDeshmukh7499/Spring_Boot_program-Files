package com.yash.bank;

public class Test {
 public static void main(String[] args) {
	PaymentService ps=new PaymentService();
	ps.cp=new CreditcardPayment();
//	ps.dp=new DebitcardPayment();
	ps.processPayment(8282);
}
}
