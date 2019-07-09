package cn.yonyong.shiro.mapper;

import cn.yonyong.shiro.pojo.Permission;

import java.util.List;

public interface PermissionMapper {
	public List<Permission> listPermissionsByUserName(String userName);
	
}
