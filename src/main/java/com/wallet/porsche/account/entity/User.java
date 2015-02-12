/**
 * @(#)User.java
 *
 * Copyright 2011 Wallet Technology, Inc. All rights reserved.
 */
package com.wallet.porsche.account.entity;

import java.io.Serializable;

/**
 * 平台的用户
 * 
 * @author Kevin Sun
 *
 */
public class User implements Serializable {
	private static final long serialVersionUID = 248247229570154984L;
	private String id;
	private String email;
	private String mobile;
	private UserType userType;


	private static enum UserType {
		GENERAL, ADMIN, FINANCE
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}
}
