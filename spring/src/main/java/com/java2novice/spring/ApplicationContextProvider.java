package com.java2novice.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextProvider implements ApplicationContextAware {

	private static ApplicationContext context;
	
	
	public ApplicationContext getApplicationContext(){
		return context;
	}
	
	@Override
	public void setApplicationContext(ApplicationContext ac) throws BeansException {
		// TODO Auto-generated method stub
		context = ac;
	}

}
