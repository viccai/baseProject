package com.base.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.dao.MUserMapper;
import com.base.model.MUser;
import com.base.model.MUserExample;
import com.base.service.IManagerService;
import com.base.util.MD5Util;

@Service("managerService")
public class ManagerServiceImpl implements IManagerService {

	private static Logger logger = Logger.getLogger(ManagerServiceImpl.class);
	@Autowired
	private MUserMapper mUserMapper;

	@Override
	public Map<String, Object> managerLogin(HttpServletRequest request,
			String userName, String password) {
		Map<String, Object> rmap = new HashMap<String, Object>();

		MUserExample mUserExa = new MUserExample();
		mUserExa.createCriteria().andUsernameEqualTo(userName);
		List<MUser> mUserList = this.mUserMapper.selectByExample(mUserExa);
		if (mUserList.size() == 0) {
			rmap.put("resultCode", -2);
			rmap.put("resultMsg", "用户不存在");
		} else {
			if (mUserList.size() == 1) {
				MUser mUser = mUserList.get(0);
				if (mUser.getPassword().equals(MD5Util.encode(password))) {
					logger.info(mUser.getUsername() + "登陆系统");
					request.getSession().setAttribute("MUSER", mUser);
					rmap.put("resultCode", 1);
				} else {
					rmap.put("resultCode", -1);
					rmap.put("resultMsg", "密码不正确");
				}
			} else {
				rmap.put("resultCode", -2);
				rmap.put("resultMsg", "用户名有重复，请联系系统管理员进行处理");
			}
		}

		return rmap;
	}

	@Override
	public Map<String, Object> updatePassword(MUser mUser, String oldPassword,
			String newPassword) {
		Map<String, Object> rmap = new HashMap<String, Object>();
		
		logger.info(mUser.getUsername()+"修改密码");
		
		if (mUser.getPassword().equals(MD5Util.encode(oldPassword))) {
			mUser.setPassword(MD5Util.encode(newPassword));
			int i = this.mUserMapper.updateByPrimaryKeySelective(mUser);
			if (i == 1) {
				rmap.put("resultCode", 1);
				rmap.put("resultMsg", "修改密码成功");
			} else {
				rmap.put("resultCode", -1);
				rmap.put("resultMsg", "修改密码不成功");
			}
		} else {
			rmap.put("resultCode", -1);
			rmap.put("resultMsg", "旧密码不正确");
		}
		return rmap;
	}

}
