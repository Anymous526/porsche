package com.wallet.porsche.common.utils;

import javax.servlet.http.HttpServletRequest;

import com.wallet.porsche.account.entity.User;



public class SessionUtils {
	
	//登陆用户
	private static final String LOGON_USER = "logOnUser";
	

	/**
	 * set Object to session
	 * @param request
	 * @param key
	 * @param value
	 */
	public static <T> void setAttr(HttpServletRequest request, String key, T value) {
		request.getSession(true).setAttribute(key, value);
	}
	

	/**
	 * get Object from session 
	 * @param request
	 * @param key
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getAttr(HttpServletRequest request, String key){		
		return  (T)request.getSession(true).getAttribute(key);		
	}
	
	public  User getLoginUser(HttpServletRequest request){
		return getAttr(request, LOGON_USER);
	}
	
	public  void setLoginUser(HttpServletRequest request, User user){
		setAttr(request, LOGON_USER, user);
	}
}
