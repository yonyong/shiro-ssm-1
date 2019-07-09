package cn.yonyong.shiro.mapper;

import cn.yonyong.shiro.pojo.Role;

import java.util.List;

public interface RoleMapper {
	public List<Role> listRolesByUserName(String userName);
	
}
