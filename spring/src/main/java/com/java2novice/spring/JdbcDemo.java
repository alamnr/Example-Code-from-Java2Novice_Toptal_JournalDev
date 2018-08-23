package com.java2novice.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.dao.UserDao;
import com.java2novice.dao.UserDaoImpl;
import com.java2novice.models.User;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext cfg = new ClassPathXmlApplicationContext("jdbc.xml");
		UserDao  userDao  = cfg.getBean(UserDaoImpl.class);
		System.out.println(userDao.getUserByid(1).toString());
		
		User user = new User();
		user.setUserId(2);
		user.setCountry("Bangladesh");
		user.setEmail("alamnr@gmail.com");
		user.setName("alam");
		user.setPassword("alamnr");
		
		userDao.insertUser(user);
		
		System.out.println(userDao.countUser());

	}

}
