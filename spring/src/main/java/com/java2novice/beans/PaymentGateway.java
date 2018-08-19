package com.java2novice.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class PaymentGateway {
	
	@Autowired
	private  Order order;

	public void setOrder(Order order) {
		this.order = order;
	}

	public PaymentGateway(Order order) {
		super();
		this.order = order;
	}
	
	public void processOrder(){
		System.out.println("Processing Order:"+order);
	}

}
