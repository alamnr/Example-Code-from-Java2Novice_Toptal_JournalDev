package com.java2novice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.java2novice.models.Employee;


public class EmployeeDaoImpl implements EmployeeDao {
	
	private DataSource dataSource;
	
	

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}



	@Override
	public Employee findEmployeeById(int empId) {
		// TODO Auto-generated method stub
		Employee emp = null;
		String query ="select * from employee where emp_id=?";
		Connection con = null;
		PreparedStatement prep = null;

		
		return emp;
	}

}
