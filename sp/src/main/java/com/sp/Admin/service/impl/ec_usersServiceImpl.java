package com.sp.Admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.Admin.mapper.ec_usersMapper;
import com.sp.Admin.pojo.ec_users;
import com.sp.Admin.service.ec_usersService;
@Service
public class ec_usersServiceImpl  implements ec_usersService{
@Autowired
ec_usersMapper mUsersMapper;
	@Override
	public ec_users getUsers(String userid, String userpassword) {
		
		return mUsersMapper.selectByPrimaryKey(userid);
	}
	@Override
	public List<ec_users> getuser() {
		// TODO Auto-generated method stub
		return mUsersMapper.getuser();
	}
	@Override
	public void updateuser(ec_users mUsers) {
		mUsersMapper.updateByPrimaryKey(mUsers);
		
	}

	

}
