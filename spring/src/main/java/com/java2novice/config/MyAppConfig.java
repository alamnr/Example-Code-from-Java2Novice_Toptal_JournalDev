package com.java2novice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.java2novice.beans.MyColor;
import com.java2novice.beans.RedColor;

@Configuration
@Import({JdbcConfig.class,BusinessConfig.class})
public class MyAppConfig {
	
	@Bean(name="myColorBean")
	public MyColor getMyColors(){
		return new RedColor();
	}
}
