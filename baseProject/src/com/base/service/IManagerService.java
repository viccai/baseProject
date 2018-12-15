package com.base.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.base.model.MUser;

public interface IManagerService {

	Map<String, Object> managerLogin(HttpServletRequest request,
			String userName, String password);
	
	Map<String, Object> updatePassword(MUser mUser, String oldPassword, String newPassword);

}
