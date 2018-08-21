package com.java2novice.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.service.J2nInventoryService;

public class ComponentScanDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String confFile = "applicationContext4.xml";
        ConfigurableApplicationContext context 
                                    = new ClassPathXmlApplicationContext(confFile);
        J2nInventoryService inventoryService = 
                            (J2nInventoryService) context.getBean("j2nInventoryService");
        inventoryService.testInventoryservice();

	}

}
