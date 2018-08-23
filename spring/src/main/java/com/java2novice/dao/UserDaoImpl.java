package com.java2novice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.log4j.Logger;

import com.java2novice.models.User;


public class UserDaoImpl implements UserDao {
	
	static final Logger logger = Logger.getLogger(UserDaoImpl.class); 

	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
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

	
	

}
