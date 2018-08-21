package com.java2novice.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.beans.Employee;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext cfgCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee amp = cfgCtx.getBean(Employee.class);
		System.out.println(amp.toString());
		
		/*Employee emp1= (Employee) cfgCtx.getBean("childEmployee");
		System.out.println(emp1.toString());*/
		
		

	}

}
