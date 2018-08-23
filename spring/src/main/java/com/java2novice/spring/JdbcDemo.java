package com.java2novice.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.dao.UserDao;
import com.java2novice.dao.UserDaoImpl;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext cfg = new ClassPathXmlApplicationContext("jdbc.xml");
		UserDao  userDao  = cfg.getBean(UserDaoImpl.class);
		System.out.println(userDao.getUserByid(1).toString());

	}

}