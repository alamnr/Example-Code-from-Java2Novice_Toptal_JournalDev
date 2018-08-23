package com.java2novice.dao;

import java.util.List;

import com.java2novice.models.User;

public interface UserDaoNew {
	
	public  List<User> findAllUsers();
	
	public void insertAllUsers(List<User> userList); 
}
