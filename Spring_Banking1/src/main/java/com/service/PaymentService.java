package com.service;

import com.service.payment.IPayment;

public class PaymentService {
     
	
	
	public PaymentService() {
		
		System.out.println("Constructor Called");
	
		// TODO Auto-generated constructor stub
	}
	public IPayment ipayment;
	
	public PaymentService(IPayment ipayment) {
		super();
		this.ipayment = ipayment;
	}
	public void doPayment(double amount) {
		ipayment.processPayment(amount);
		System.out.println("Process Completed....");
	}
}
