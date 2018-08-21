package com.java2novice.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.beans.MyMathTest;
import com.java2novice.beans.PaymentGateway;

public class SpElDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String confFile = "spelContext.xml";
	        ConfigurableApplicationContext context 
	                                    = new ClassPathXmlApplicationContext(confFile);
	        PaymentGateway gateway = (PaymentGateway) context.getBean("paymentGateway");
	        gateway.processOrder();
	        System.out.println(gateway.getDescription());
	        
	        MyMathTest mathTest = (MyMathTest) context.getBean("myMathTestBean");
	        System.out.println(mathTest.toString());
	}

}
