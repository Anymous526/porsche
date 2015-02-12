/**
 * @(#)UserService.java
 *
 * Copyright 2011 Wallet Technology, Inc. All rights reserved.
 */
package com.wallet.porsche.account.service.inter;

import com.wallet.porsche.account.entity.User;
import com.wallet.porsche.account.model.UserModel;


public interface UserService {
	public User save(User user);
	public User delete(User User);
	public User update(User user);
	public User getUserById();
	public UserModel getUserByPaging(UserModel model);
}
