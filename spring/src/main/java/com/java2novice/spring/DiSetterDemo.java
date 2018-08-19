package com.java2novice.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.manager.ColorManager;

public class DiSetterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ColorManager clrManager = (ColorManager)ctx.getBean("colorManager");
		clrManager.printColor();
	}

}
