package com.how2java.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.RoleMapper;
import com.how2java.pojo.Role;
import com.how2java.service.RoleService;

@Service
public class RoleServiceImpl  implements RoleService{

	@Autowired RoleMapper roleMapper;

	@Override
	public Set<String> listRoles(String userName) {
		List<Role> roles = roleMapper.listRolesByUserName(userName);
		Set<String> result = new HashSet<>();
		for (Role role: roles) {
			result.add(role.getName());
		}
		return result;
	}
}
