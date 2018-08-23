package com.java2novice.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.dao.UserDao;
import com.java2novice.dao.UserDaoImpl;
import com.java2novice.dao.UserDaoImplNew;
import com.java2novice.dao.UserDaoNew;
import com.java2novice.models.User;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext cfg = new ClassPathXmlApplicationContext("jdbc.xml");
		UserDao  userDao  = cfg.getBean(UserDaoImpl.class);
		System.out.println(userDao.getUserByid(1).toString());
		
		User user = new User();
		user.setUserId(userDao.countUser()+1);
		user.setCountry("Bangladesh");
		user.setEmail("alamnr@gmail.com");
		user.setName("alam");
		user.setPassword("alamnr");
		
		userDao.insertUser(user);
		
		System.out.println(userDao.countUser());
		
		UserDaoNew  userDaoNew  = cfg.getBean(UserDaoImplNew.class);
		
		System.out.println("-----------------------------------------------");
        List<User> userList = userDaoNew.findAllUsers();
        for(User obj:userList){
            System.out.println(obj.getName()+" | "+obj.getEmail()+" | "+obj.getCountry());
        }
        
        User user1 = new User();
        user1.setUserId(userDao.countUser()+1);
        user1.setCountry("Bangladesh");
        user1.setEmail("alamnr@gmail.com");
        user1.setName("alam");
        user1.setPassword("alamnr");
		
		User user2 = new User();
		user2.setUserId(userDao.countUser()+2);
		user2.setCountry("Bangladesh");
		user2.setEmail("alamnr@gmail.com");
		user2.setName("alam");
		user2.setPassword("alamnr");
		
		User user3 = new User();
		user3.setUserId(userDao.countUser()+3);
		user3.setCountry("Bangladesh");
		user3.setEmail("alamnr@gmail.com");
		user3.setName("alam");
		user3.setPassword("alamnr");
		
		List<User> inputs = new ArrayList<User>();
		inputs.add(user1);
		inputs.add(user2);
		inputs.add(user3);
		
		userDaoNew.insertAllUsers(inputs);
		
		
		
		

	}

}
