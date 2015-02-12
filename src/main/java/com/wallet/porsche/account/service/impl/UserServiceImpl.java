/**
 * @(#)UserServiceImpl.java
 *
 * Copyright 2011 Wallet Technology, Inc. All rights reserved.
 */
package com.wallet.porsche.account.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import com.wallet.porsche.account.dao.inter.UserDAO;
import com.wallet.porsche.account.entity.User;
import com.wallet.porsche.account.model.UserModel;
import com.wallet.porsche.account.service.inter.UserService;

public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public User save(User user) {
		
		return null;
	}

	@Override
	public User delete(User User) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel getUserByPaging(UserModel model) {
		// TODO Auto-generated method stub
		return null;
	}


}
