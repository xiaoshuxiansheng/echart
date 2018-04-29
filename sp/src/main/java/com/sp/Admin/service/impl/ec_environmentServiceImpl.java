package com.sp.Admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.Admin.mapper.ec_environmentMapper;
import com.sp.Admin.pojo.ec_environment;
import com.sp.Admin.service.ec_environmentService;

@Service
public class ec_environmentServiceImpl  implements ec_environmentService{
@Autowired ec_environmentMapper mEnvironmentMapper;
	@Override
	public List<ec_environment> getnewenvironment() {
		return mEnvironmentMapper.getNewEnvironment();
	}
	@Override
	public List<ec_environment> getenvironment() {
		// TODO Auto-generated method stub
		return mEnvironmentMapper.getEnvironment();
	}

}
