package com.sp.Admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.Admin.mapper.ec_usersMapper;
import com.sp.Admin.mapper.ec_visitorMapper;
import com.sp.Admin.pojo.ec_visitor;
import com.sp.Admin.service.ec_visitorService;
@Service
public class ec_visitorServiceImpl  implements ec_visitorService{
@Autowired
ec_visitorMapper mVisitorMapper;

@Override
public List<ec_visitor> getnewvisitor() {
	// TODO Auto-generated method stub
	return mVisitorMapper.getNewVisitor();
}

@Override
public List<ec_visitor> getvisitor() {
	// TODO Auto-generated method stub
	return mVisitorMapper.getVisitor();
}
	
}
