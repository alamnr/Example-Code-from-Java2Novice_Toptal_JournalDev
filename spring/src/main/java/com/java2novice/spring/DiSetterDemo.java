package com.java2novice.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.beans.MutableEmployeeBean;
import com.java2novice.manager.ColorManager;

public class DiSetterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ColorManager clrManager = (ColorManager)ctx.getBean("colorManager");
		clrManager.printColor();
		
		ColorManager clrManager1 = (ColorManager)ctx.getBean("colorManager");
		clrManager1.printColor();
		
		System.out.println(clrManager == clrManager1);
		
		MutableEmployeeBean emp = ctx.getBean("employeeBean",MutableEmployeeBean.class);
		System.out.println(emp.getEmpId());
		emp.setName("Juvan");
		System.out.println(emp);
		
		
	}

}
