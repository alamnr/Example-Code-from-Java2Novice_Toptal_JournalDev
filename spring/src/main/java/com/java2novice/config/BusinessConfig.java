package com.java2novice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java2novice.service.MyBusinessService;

@Configuration
public class BusinessConfig {

	@Bean(name="businessService")
	public MyBusinessService getBusinessService(){
		return new MyBusinessService();
	}
}
