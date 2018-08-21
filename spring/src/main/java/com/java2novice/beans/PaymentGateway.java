package com.java2novice.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
//@Scope("prototype")
@Component("paymentGateway")
public class PaymentGateway {
	
	//@Autowired
	@Value("#{orderBean}")
	private  Order order;
	
	@Value("#{orderBean.item}")
	private String itemName;
	
	@Value("#{orderBean.getDescription('Log Entry')}")
	private String description;
	
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Order getOrder() {
		return order;
	}

	public String getItemName() {
		return itemName;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public PaymentGateway(Order order) {
		super();
		this.order = order;
	}
	
	public PaymentGateway(){
		
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void processOrder(){
		System.out.println("Processing Order:"+order.getItem());
	}

}
