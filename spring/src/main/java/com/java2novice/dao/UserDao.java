package com.java2novice.dao;

import com.java2novice.models.User;

public interface UserDao {
	public User getUserByid(int userId);
	public void insertUser(User user);
	
	public int countUser();
}
