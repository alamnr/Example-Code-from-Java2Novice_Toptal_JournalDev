package com.java2novice.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.beans.PaymentGateway;

public class ComponentScanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext  ctx= new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		PaymentGateway  paymentGateway = ctx.getBean(PaymentGateway.class);
		
		paymentGateway.processOrder();

	}

}
