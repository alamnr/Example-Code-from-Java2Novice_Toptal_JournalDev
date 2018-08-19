package com.java2novice.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Lazy
public class Order {
	
	
	private final String item;
	
	private final double price;
	
	private final String address;
	
	public Order(String item, double price, String address) {
		super();
		this.item = item;
		this.price = price;
		this.address = address;
	}
	public String getItem() {
		return item;
	}
	public double getPrice() {
		return price;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Order [item=" + item + ", price=" + price + ", address=" + address + "]";
	}
	
	
	
	

}
