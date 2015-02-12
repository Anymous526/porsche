package com.wallet.porsche.common.dao;

public interface BaseDAO<T,F> {
	
	public   void saveEntity(T t);
	
	public  void updateEntity(T t);
	
	public  void delEntity(T t);
	
	public  void delEntityById(String id);
	
	public  T getEntityById(String id);
	
	public T getEntities();
	
	
}
