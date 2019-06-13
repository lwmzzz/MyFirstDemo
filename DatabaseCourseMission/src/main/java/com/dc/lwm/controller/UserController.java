/**
 * 
 */
package com.dc.lwm.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.dc.lwm.entity.User;
import com.dc.lwm.service.UserService;
/**
 * @author 鏉庡穽宀�
 * @date 2019骞�6鏈�7鏃�
 *
 * 
 */
@Controller
@RequestMapping(value = "/user")
@SessionAttributes("user")
public class UserController {
	@Resource
	private UserService userService;
	/*
	 * @RequestMapping(value="/login")
	public String Login(HttpServlet requst,HttpServletResponse response) {
		
	}*/
	@RequestMapping(value= "/login")
	public String login(@RequestParam("username") String username,@RequestParam("password") String password ) {
		User user = new User();
		user.setUserId(Long.parseLong(username));
		user.setUserPwd(password);
		System.out.println(user);
		System.out.println(userService.login(user.getUserId(), password));
		if(userService.login(user.getUserId(), password)!=null&&userService.login(user.getUserId(), password).getUserType().equals("管理员")) {
			return"redirect:/admin/studentlist";
		}
		else if(userService.login(user.getUserId(), password)!=null&&userService.login(user.getUserId(), password).getUserType().equals("学生")) 
			return "redirect:/student/index";
		else if(userService.login(user.getUserId(), password)!=null&&userService.login(user.getUserId(), password).getUserType().equals("教师")) 
			return "redirect:/teacher/index";
		else {
			return "fail";
		}
	}
}
