package com.sp.Admin.service;

import java.util.List;

import com.sp.Admin.pojo.ec_users;

public interface ec_usersService {

	ec_users getUsers(String userid,String userpassword);

	List<ec_users> getuser();

	void updateuser(ec_users mUsers);
	
}


