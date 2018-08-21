package com.java2novice.spring;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.beans.MyColor;
import com.java2novice.beans.SpringFirstTest;
import com.java2novice.config.MyAppConfig;
import com.java2novice.manager.NetworkManager;
import com.java2novice.service.MyBusinessService;
import com.java2novice.service.MyJdbcService;

public class SpringDemo {
	
	static final Logger logger = Logger.getLogger(SpringDemo.class);  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String confFile = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		SpringFirstTest sft = (SpringFirstTest)context.getBean("springTest");
		sft.testMe();
		
		context = new AnnotationConfigApplicationContext(MyAppConfig.class);
		MyColor color = (MyColor) context.getBean("myColorBean");
		color.printColor();
		
		ApplicationContextProvider appContext = new ApplicationContextProvider();
		SpringFirstTest test = appContext.getApplicationContext().getBean("springTest",SpringFirstTest.class);
		test.testMe();
		
		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyAppConfig.class);
		MyJdbcService jdbcService;
		//jdbcService = ctx.getBean(MyJdbcService.class);
		//jdbcService  = (MyJdbcService) ctx.getBean("jdbcService");
		jdbcService  =  ctx.getBean("jdbcService",MyJdbcService.class);
		
		ConfigurableApplicationContext  cfgContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
		NetworkManager networkMng = (NetworkManager) cfgContext.getBean("netManager");
        networkMng.readData();
        cfgContext.close();
		
		jdbcService.createJdbcConnection();
		
		MyBusinessService businessService;
		//businessService = ctx.getBean(MyBusinessService.class);
		//businessService  = (MyBusinessService) ctx.getBean("businessService");
		businessService  =  ctx.getBean("businessService",MyBusinessService.class);
		businessService.runMyBusiness();
		
		
		logger.error("Hi there, I'm logging");
		
		
		
	}

}
