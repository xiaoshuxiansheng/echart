package com.sp.Admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.env.MockEnvironment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sp.Admin.pojo.ec_environment;
import com.sp.Admin.pojo.ec_ie;
import com.sp.Admin.pojo.ec_step;
import com.sp.Admin.pojo.ec_visitor;
import com.sp.Admin.pojo.ec_visitorExample;
import com.sp.Admin.service.ec_environmentService;
import com.sp.Admin.service.ec_ieService;
import com.sp.Admin.service.ec_stepService;
import com.sp.Admin.service.ec_visitorService;


@Controller
@RequestMapping(value="/chart")
public class ChartController {
@Autowired ec_visitorService mVisitorService;
@Autowired ec_ieService mIeService;
@Autowired ec_environmentService mEnvironmentService;
@Autowired ec_stepService mStepService;
	
	//折线图视图
@RequestMapping("line")
public String line() {
	return "chart_line";
}
//柱状图视图 
@RequestMapping("columnar")
public String columnar() {
	return "chart_columnar";
}

//饼状图视图
@RequestMapping("pie")
public String pie() {
	return "chart_pie";
}

//获取最新广告来源数据
@RequestMapping("getnewvisitor")
public @ResponseBody List<ec_visitor> getnewvisitor() {
	return mVisitorService.getnewvisitor();
}
//获取最新收支数据
@RequestMapping("getnewie")
public @ResponseBody List<ec_ie> getnewie(){
	return mIeService.getnewie();
}
//获取最新环境数据
@RequestMapping("getnewenvironment")
public @ResponseBody List<ec_environment> getnewenvironment(){
	return mEnvironmentService.getnewenvironment();
}
//获取最新step数据
@RequestMapping("getnewstep")
public @ResponseBody List<ec_step> getnewstep(){
	return mStepService.getnewstep();
}


}
