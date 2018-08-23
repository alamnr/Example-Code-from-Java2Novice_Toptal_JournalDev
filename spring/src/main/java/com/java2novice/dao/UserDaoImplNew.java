package com.java2novice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.java2novice.models.User;


public class UserDaoImplNew extends JdbcDaoSupport implements UserDao, UserDaoNew {
	
	static final Logger logger = Logger.getLogger(UserDaoImplNew.class); 

	
	@Override
	public User getUserByid(int userId) {
		
		String query = "select * from  users where id=?";
		
		Object[] inputs = new Object[]{userId};
		return getJdbcTemplate().queryForObject(query,inputs,new BeanPropertyRowMapper<>(User.class));
		
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
		//return getJdbcTemplate().queryForInt(query);
	}


	@Override
	public List<User> findAllUsers() {
		
		List<User> userList = new ArrayList<User>();
		String query = "select * from  users";
		userList = getJdbcTemplate().query(query, new BeanPropertyRowMapper(User.class));
		return userList;
	}


	@Override
	public void insertAllUsers(List<User> userList) {
		String query = "insert into users (id,name,email,country,password) values (?,?,?,?,?)";
		List<Object[]> inputList =new ArrayList<Object[]>();
        for(User user:userList){
            Object[] tmp = {user.getUserId(),user.getName(),user.getEmail(),user.getCountry(),user.getPassword()};
            inputList.add(tmp);
        }
		getJdbcTemplate().batchUpdate(query, inputList);
		
		
	}

	
	

}
