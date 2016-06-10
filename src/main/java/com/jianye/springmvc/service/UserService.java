package com.jianye.springmvc.service;

import java.util.List;

import com.jianye.springmvc.model.UserInfo;

public interface UserService {
	UserInfo getUserById(int id);
	
	List<UserInfo> getUsers();
	
	int insert(UserInfo userInfo);
}
