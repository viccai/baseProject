package com.base.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.base.model.MUser;
import com.base.service.IManagerService;

@Controller
@RequestMapping("/manager")
public class ManagerController {
	
	@Resource
	private IManagerService managerService;
	
	/**
	 * 管理后台登陆页面
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("")
	public String gotoIndex(HttpServletRequest request, Model model) {
		
		return "manager/index";
	}
	
	/**
	 * 管理后台登陆方法
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/login")
	public @ResponseBody
	Map<String, Object> login(HttpServletRequest request,
			HttpServletResponse response) throws UnsupportedEncodingException {
		Map<String, Object> rmap = new HashMap<String, Object>();
		
		//修改一下编码处理-begin
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		//修改一下编码处理-end
		

		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		rmap = this.managerService.managerLogin(request, userName, password);

		return rmap;

	}
	
	/**
	 *
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/manager")
	public String manager(HttpServletRequest request, Model model) {
		if (!this.checkLogin(request)) {
			return "error/managerNoLoginError";
		}
		//获取会话中的用户信息:2017-5-5 下午
		/*Manager manager = (Manager) request.getSession().getAttribute("manager");
		//法案二:查询三个表的数据，结果不会触发，在SQL语句中添加了DISTINCT关键字
		List<ManagerMenu> menuList=this.menuService.getMenuAllMiddleInfoList(manager.getUuid());
		if (menuList!=null) {
			model.addAttribute("rsMenuList",menuList);
		}*/
		return "manager/manager";
	}
	
	@RequestMapping("/welcome")
	public String welcome(HttpServletRequest request, Model model) {
		if (!this.checkLogin(request)) {
			return "error/managerNoLoginError";
		}
		
		model.addAttribute(request.getSession().getAttribute("MUSER"));
		
		return "manager/welcome";
	}
	
	/**
	 * 修改密码方法
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/updatePassword")
	public @ResponseBody
	Map<String, Object> updatePassword(HttpServletRequest request,
			HttpServletResponse response) throws UnsupportedEncodingException {
		Map<String, Object> rmap = new HashMap<String, Object>();
		
		request.setCharacterEncoding("UTF-8");

		String oldPassword = request.getParameter("old_password");
		String newPassword = request.getParameter("new_password");

		if (!this.checkLogin(request)) {
			rmap.put("resultCode", -1);
			rmap.put("resultMsg", "非法用户");
		}else{
			MUser mUSER = (MUser) request.getSession().getAttribute("MUSER");
			rmap = this.managerService.updatePassword(mUSER, oldPassword, newPassword);
		}

		return rmap;

	}
	
	/**
	 * 注销方法
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/logout")
	public @ResponseBody
	Map<String, Object> logout(HttpServletRequest request,
			HttpServletResponse response) throws UnsupportedEncodingException {
		Map<String, Object> rmap = new HashMap<String, Object>();
		
		request.setCharacterEncoding("UTF-8");

		if (!this.checkLogin(request)) {
			rmap.put("resultCode", -1);
			rmap.put("resultMsg", "非法用户");
		}else{
			request.getSession().removeAttribute("MUSER");
			rmap.put("resultCode", 1);
		}

		return rmap;

	}
	
	/**
	 * 检测用户是否登陆
	 * 
	 * @param request
	 * @return
	 */
	private boolean checkLogin(HttpServletRequest request){
		boolean flag = false;
		
		MUser mUser = (MUser) request.getSession().getAttribute("MUSER");
		if(mUser != null){
			flag = true;
		}
		
		return flag;
	}
	
}
