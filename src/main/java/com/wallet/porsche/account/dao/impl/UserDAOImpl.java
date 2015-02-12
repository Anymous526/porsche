/**
 * @(#)UserDAOImpl.java
 *
 * Copyright 2011 Wallet Technology, Inc. All rights reserved.
 */
package com.wallet.porsche.account.dao.impl;

/**
 * @author Kevin
 * @version 1.0
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wallet.porsche.account.dao.inter.UserDAO;
import com.wallet.porsche.account.entity.User;
import com.wallet.porsche.account.mapper.UserMapper;
import com.wallet.porsche.account.model.UserModel;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	private UserMapper userMapper;
	
	public User save(User user) {
		
		return user;
	}

	public User delete(User user) {
		
		return user;
	}

	public User update(User user) {
		return user;
	}

	public User getUserById() {
		return null;
	}

	public UserModel getUserByPaging(UserModel model) {
		return null;
	}
}
