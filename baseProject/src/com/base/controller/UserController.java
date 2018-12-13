package com.base.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.base.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private IUserService userService;
	
	@RequestMapping("/toAddUser")
	public String toAddUser(HttpServletRequest request, Model model) {
		
		return "addUser";
	}

	@RequestMapping("/addUser")
	public @ResponseBody Map<String, Object> addUser(HttpServletRequest request,HttpServletResponse response) {
		Map<String, Object> rmap = new HashMap<String, Object>();
		
		rmap = this.userService.addUser(request, response);

		return rmap;

	}
}
