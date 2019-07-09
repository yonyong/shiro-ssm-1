package com.how2java.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.PermissionMapper;
import com.how2java.pojo.Permission;
import com.how2java.service.PermissionService;

@Service
public class PermissionServiceImpl  implements PermissionService{

	@Autowired PermissionMapper permissionMapper;

	@Override
	public Set<String> listPermissions(String userName) {
		List<Permission> permissions = permissionMapper.listPermissionsByUserName(userName);
		Set<String> result = new HashSet<>();
		for (Permission permission: permissions) {
			result.add(permission.getName());
		}
		return result;
	}
}
