package com.how2java.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.UserMapper;
import com.how2java.pojo.User;
import com.how2java.service.UserService;

@Service
public class UserServiceImpl  implements UserService{

	@Autowired UserMapper userMapper;
	
	@Override
	public String getPassword(String name) {
		// TODO Auto-generated method stub
		User u  = userMapper.getByName(name);
		if(null==u)
			return null;
		return u.getPassword();
	}

}
