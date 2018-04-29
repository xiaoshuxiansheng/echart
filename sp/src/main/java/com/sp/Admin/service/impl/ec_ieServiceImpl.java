package com.sp.Admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.Admin.mapper.ec_ieMapper;
import com.sp.Admin.pojo.ec_ie;
import com.sp.Admin.service.ec_ieService;

@Service
public class ec_ieServiceImpl  implements ec_ieService{
@Autowired
ec_ieMapper mIeMapper;
	@Override
	public List<ec_ie> getnewie() {
		return mIeMapper.getNewIe();
	}
	@Override
	public List<ec_ie> getie() {
		// TODO Auto-generated method stub
		return mIeMapper.getIe();
	}

}
