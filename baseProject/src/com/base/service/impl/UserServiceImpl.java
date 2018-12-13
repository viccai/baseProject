package com.base.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.dao.UserMapper;
import com.base.model.User;
import com.base.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	private static Logger logger = Logger.getLogger(UserServiceImpl.class);

	@Autowired
	private UserMapper userMapper;

	@Override
	@Transactional
	public Map<String, Object> addUser(HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> rmap = new HashMap<String, Object>();
		
		String userName = request.getParameter("username");
		
		logger.info("添加用户："+userName);
		
		String uuid = UUID.randomUUID().toString();
		
		User user = new User();
		user.setUuid(uuid);
		user.setUsername(userName);
		
		int i = this.userMapper.insertSelective(user);

		if(i==1){
			
			User user1 = new User();
			user1.setUuid(uuid);
			user1.setUsername(userName);
			
			int j = this.userMapper.insertSelective(user);
			
			rmap.put("resultCode", -1);
			rmap.put("resultMsg", "添加成功");
		}else{
			rmap.put("resultCode", -1);
			rmap.put("resultMsg", "添加失败");
		}
		
		return rmap;
	}

	@Override
	@Transactional
	public void testAddUserRollback(String userName) {
		
		logger.info("添加用户："+userName);
		
		String uuid = UUID.randomUUID().toString();
		
		User user = new User();
		user.setUuid(uuid);
		user.setUsername("张三");
		this.userMapper.insertSelective(user);
		
		User user1 = new User();
		user1.setUuid(uuid);
		user1.setUsername("李四");
		this.userMapper.insertSelective(user1);
	}
}
