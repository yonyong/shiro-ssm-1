package com.how2java.mapper;

import java.util.List;

import com.how2java.pojo.Permission;

public interface PermissionMapper {
	public List<Permission> listPermissionsByUserName(String userName);
	
}
