package com.java2novice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.java2novice.models.User;


public class UserDaoImplNew extends JdbcDaoSupport implements UserDao {
	
	static final Logger logger = Logger.getLogger(UserDaoImplNew.class); 

	
	@Override
	public User getUserByid(int userId) {
		
		String query = "select * from  users where id=?";
		
		Object[] inputs = new Object[]{userId};
		return getJdbcTemplate().queryForObject(query, User.class);
		
	}


	@Override
	public void insertUser(User user) {
		String query = "insert into users (id,name,email,country,password) values (?,?,?,?,?)";
		Object[] inputs = new Object[]{user.getUserId(),user.getName(),user.getEmail(),user.getCountry(),user.getPassword()};
		getJdbcTemplate().update(query, inputs);
		
	}


	@Override
	public int countUser() {
		
		String query = "select count(*) from users";
		
		return getJdbcTemplate().queryForObject(query, Integer.class).intValue();
	}

	
	

}
