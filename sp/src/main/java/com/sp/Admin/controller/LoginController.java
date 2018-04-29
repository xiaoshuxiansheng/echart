package com.sp.Admin.controller;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sp.Admin.pojo.ec_users;
import com.sp.Admin.service.ec_usersService;

@Controller
@RequestMapping(value="/admin")
public class LoginController {
	
	@Autowired 
	ec_usersService mUsersService;
@RequestMapping("login")
public String login() {
	return "pages_sign-in";
}

@RequestMapping("checklogin")
public String checklogin(String userid,String userpassword,HttpSession session) {
	ec_users mUsers=mUsersService.getUsers(userid,userpassword);
	if (mUsers!=null) {
		session.setAttribute("user", mUsers);
		return "pages_index";
	}
	return "pages_sign-in";
}
}
