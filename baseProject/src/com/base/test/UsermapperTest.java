package com.base.test;

import java.util.UUID;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.base.dao.UserMapper;
import com.base.model.User;
import com.base.service.IUserService;

public class UsermapperTest extends BaseTest {
	
	/*@Resource
	private UserMapper userMapper;*/
	@Resource
	private IUserService userService;
	
	/*@Test
	@Rollback(false)
	public void testAddUser(){
		User user = new User();
		user.setUuid(UUID.randomUUID().toString());
		user.setUsername("李四");
		this.userMapper.insertSelective(user);
	}*/
	
	@Test
	@Rollback(false)
	public void testAddUserRollback(){
		String userName = "王五";
		this.userService.testAddUserRollback(userName);
	}
}
