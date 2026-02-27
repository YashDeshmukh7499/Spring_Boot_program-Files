package com.service.payment;

public class CreditcardPayment implements IPayment {
     @Override
     
     
     
     
    public void processPayment(double amount) {
    	System.out.println("Process processed by CreditCard"+amount);
    	
    }

	 public CreditcardPayment() {
		super();
		
		System.out.println("Creditcard Constructor Called,....");
		// TODO Auto-generated constructor stub
	 }
}
