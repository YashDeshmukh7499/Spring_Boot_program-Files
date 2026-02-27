package com.yash.bank;

public class PaymentService {

	
	DebitcardPayment dp;
	CreditcardPayment cp;
	
	void processPayment(double  amount ) {
		
		System.out.println("Total amount is :"+amount);
	}
}
