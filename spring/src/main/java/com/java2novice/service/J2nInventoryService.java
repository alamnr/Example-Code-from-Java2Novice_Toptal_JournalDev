package com.java2novice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java2novice.dao.InventoryDao;

@Service("j2nInventoryService")
public class J2nInventoryService {
	
	@Autowired
	private InventoryDao inventoryDao;
	
	public void testInventoryservice(){
		System.out.println("Inside service class, testInventoryService()");
		inventoryDao.printInventoryDaoStatus();
	}

}
