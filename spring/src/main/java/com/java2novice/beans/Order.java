package com.java2novice.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("orderBean")
public class Order {
	
	@Value("Java Book")
	private  String item;
	
	@Value("345")
	private  double price;
	
	@Value("India")
	private  String address;
	
	@Value("true")
    private boolean taxPaid;
	
	/*public Order(String item, double price, String address) {
		super();
		this.item = item;
		this.price = price;
		this.address = address;
	}*/
	
	
	
	
	public String getItem() {
		return item;
	}
	public boolean isTaxPaid() {
		return taxPaid;
	}
	public void setTaxPaid(boolean taxPaid) {
		this.taxPaid = taxPaid;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getPrice() {
		return price;
	}
	public String getAddress() {
		return address;
	}
	
	public String getDescription(String prefix){
        return prefix+": "+item+" | "+price+" | "+address;
    }
 
	@Override
	public String toString() {
		return "Order [item=" + item + ", price=" + price + ", address=" + address + "]";
	}
	
	
	
	

}
