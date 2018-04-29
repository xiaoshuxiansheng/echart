package com.sp.Admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.Admin.mapper.ec_stepMapper;
import com.sp.Admin.pojo.ec_step;
import com.sp.Admin.service.ec_stepService;

@Service
public class ec_stepServiceImpl  implements ec_stepService{
@Autowired ec_stepMapper mStepMapper;
	@Override
	public List<ec_step> getnewstep() {
		// TODO Auto-generated method stub
		return mStepMapper.getNewStep();
	}
	@Override
	public List<ec_step> getstep() {
		// TODO Auto-generated method stub
		return mStepMapper.getStep();
	}

}
