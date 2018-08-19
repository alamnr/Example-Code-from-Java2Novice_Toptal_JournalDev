package com.java2novice.beans;

public class MutableEmployeeBean {
	
	private int empId;
	private String name;
	private String role;
	
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
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "MutableEmployeeBean [empId=" + empId + ", name=" + name + ", role=" + role + "]";
	}
	
	}
