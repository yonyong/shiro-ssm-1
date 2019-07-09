package cn.yonyong.shiro.service;

import java.util.Set;

public interface RoleService {
	public Set<String> listRoles(String userName);
}