package com.service.payment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.PaymentService;

public class Test {

	
	public static void main(String[] args) {
//		PaymentService ps=new PaymentService();
//		ps.ipayment=new CreditcardPayment();
//		ps.doPayment(1222);
		
		ApplicationContext context=new ClassPathXmlApplicationContext("yash.xml");
	   PaymentService bean = context.getBean(PaymentService.class);
	   bean.doPayment(727);
		
//		System.out.println(bean.hashCode());
	}
}
