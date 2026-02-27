package com.service.payment;

public class DebitCardPayment implements IPayment{
	public DebitCardPayment() {
		System.out.println("Debit Constrictor");
		// TODO Auto-generated constructor stub
	}
	public void processPayment(double amount) {
    	System.out.println("Process processed by DeditCard"+amount);
    	
    }
}
