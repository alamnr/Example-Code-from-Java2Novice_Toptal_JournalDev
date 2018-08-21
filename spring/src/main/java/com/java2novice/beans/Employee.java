package com.java2novice.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Required;

import com.java2novice.custom.annotion.Mandatory;

public class Employee {
	
	private int empId;
	private String name;
	private String role;
	private Date doj;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	//@Required
	@Mandatory
	public void setRole(String role) {
		this.role = role;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", role=" + role + ", doj=" + doj + "]";
	}
	
	

}
