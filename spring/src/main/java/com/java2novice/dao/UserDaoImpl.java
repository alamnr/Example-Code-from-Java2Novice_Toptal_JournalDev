package com.java2novice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.java2novice.models.User;


public class UserDaoImpl implements UserDao {
	
	static final Logger logger = Logger.getLogger(UserDaoImpl.class); 

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}




	@Override
	public User getUserByid(int userId) {
		// TODO Auto-generated method stub
		User user = null;
		String query = "select * from  users where id=?";
		
		
		try(Connection conn = dataSource.getConnection();PreparedStatement prepStmt = conn.prepareStatement(query);)
		{
			
			prepStmt.setInt(1, userId);
			ResultSet resultSet = prepStmt.executeQuery();
			user = new User();
			while(resultSet.next()){
				user.setUserId(userId);
				user.setName(resultSet.getString("name"));
				user.setEmail(resultSet.getString("email"));
				user.setCountry(resultSet.getString("country"));
				user.setPassword(resultSet.getString("password"));
			}
			
		}
		catch (SQLException e) {
			logger.error(e.getMessage(),e);
		}
		
		return user;
	}


	@Override
	public void insertUser(User user) {
		String query = "insert into users (id,name,email,country,password) values (?,?,?,?,?)";
		jdbcTemplate = new JdbcTemplate(dataSource);
		Object[] inputs = new Object[]{user.getUserId(),user.getName(),user.getEmail(),user.getCountry(),user.getPassword()};
		jdbcTemplate.update(query, inputs);
		
	}


	@Override
	public int countUser() {
		
		String query = "select count(*) from users";
		jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate.queryForObject(query, Integer.class).intValue();
	}

	
	

}
