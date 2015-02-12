/**
 * @(#)UserModel.java
 *
 * Copyright 2011 Wallet Technology, Inc. All rights reserved.
 */
package com.wallet.porsche.account.model;

import java.io.Serializable;
import java.util.List;

import com.wallet.porsche.account.entity.User;

public class UserModel implements Serializable {

	private static final long serialVersionUID = 7171765200170304258L;
	private int pageSize;
	private int pageNum;
	private int totalRecord;
	private String condition;
	private String order;
	private List<User> pageRecord;

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public List<User> getPageRecord() {
		return pageRecord;
	}

	public void setPageRecord(List<User> pageRecord) {
		this.pageRecord = pageRecord;
	}

}
