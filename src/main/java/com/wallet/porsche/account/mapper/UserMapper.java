package com.wallet.porsche.account.mapper;

import java.util.Map;

import com.wallet.porsche.account.entity.User;

public interface UserMapper {
	public void insert(User user);

	public void update(User user);

	public void delete(User user);

	public void selectById(String id);

	public void selectByPaging(Map<String, Object> map);

}
