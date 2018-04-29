package com.sp.Admin.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import net.sf.json.JSONObject;

import com.sp.Admin.pojo.ec_code;
import com.sp.Admin.pojo.ec_environment;
import com.sp.Admin.pojo.ec_ie;
import com.sp.Admin.pojo.ec_step;
import com.sp.Admin.pojo.ec_users;
import com.sp.Admin.pojo.ec_visitor;
import com.sp.Admin.service.ec_environmentService;
import com.sp.Admin.service.ec_ieService;
import com.sp.Admin.service.ec_stepService;
import com.sp.Admin.service.ec_usersService;
import com.sp.Admin.service.ec_visitorService;


@Controller
@RequestMapping(value="/table")
public class TableController {
@Autowired ec_usersService mUserService;	
@Autowired ec_visitorService mVisitorService;
@Autowired ec_ieService mIeService;
@Autowired ec_environmentService mEnvironmentService;
@Autowired ec_stepService mStepService;
	
@RequestMapping("user")
public String user() {
	return "table_user";
}
//获取所有用户数据
@RequestMapping("getuser")
public @ResponseBody List<ec_users> getuser(){
	return mUserService.getuser();
}
//获取所有广告来源数据
@RequestMapping("getvisitor")
public @ResponseBody List<ec_visitor> getvisitor() {
	return mVisitorService.getvisitor();
}

//获取所有收支数据
@RequestMapping("getie")
public @ResponseBody List<ec_ie> getie(){
	return mIeService.getie();
}

//获取所有环境数据
@RequestMapping("getenvironment")
public @ResponseBody List<ec_environment> getenvironment(){
	return mEnvironmentService.getenvironment();
}

//获取所有step数据
@RequestMapping("getstep")
public @ResponseBody List<ec_step> getstep(){
	return mStepService.getstep();
}
//修改用户信息
//{"user_id":"17674352459","user_password":"111111","user_nickname":"陈果","user_phone":"17674352459",
//"user_regtime":"","user_regip":"","user_ltlogip":"",
//"user_portraituri":"http://img.dongqiudi.com/uploads/avatar/2015/07/25/QM387nh7As_thumb_1437790672318.jpg"}
@RequestMapping("updateuser")
public @ResponseBody ec_code updateuser(@RequestBody String Str) {
	System.err.println(Str);
	ec_users mUsers=new ec_users();
	ec_code code=new ec_code();
	JSONObject json=JSONObject.fromObject(Str);
	mUsers.setUserId(json.getString("user_id"));
	mUsers.setUserLtlogip(json.getString("user_ltlogip"));
	mUsers.setUserNickname(json.getString("user_nickname"));
	mUsers.setUserPassword(json.getString("user_password"));
	mUsers.setUserPhone(json.getString("user_phone"));
	mUsers.setUserPortraituri(json.getString("user_portraituri"));
	mUsers.setUserRegip(json.getString("user_regip"));
	mUsers.setUserRegtime(json.getString("user_regtime"));
	mUserService.updateuser(mUsers);
	code .setCode(200);
	return code;
}

}
