package com.how2java.mapper;

import java.util.List;

import com.how2java.pojo.Role;

public interface RoleMapper {
	public List<Role> listRolesByUserName(String userName);
	
}
