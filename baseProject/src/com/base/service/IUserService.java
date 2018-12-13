package com.base.service;

import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IUserService {
	Map<String,Object> addUser(HttpServletRequest request,HttpServletResponse response);
	
	void testAddUserRollback(String userName);
}
