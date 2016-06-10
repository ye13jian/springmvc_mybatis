package com.jianye.springmvc;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.jianye.springmvc.model.UserInfo;
import com.jianye.springmvc.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring.xml",
		"classpath:spring/spring-mybatis.xml"})
public class TestUserService {
	
	private static final Logger logger = Logger.getLogger(TestUserService.class);
	
	@Autowired
	private UserService userService;
	
	@Test
	public void testGetUserById() {
		UserInfo userInfo = userService.getUserById(1);
		logger.info(JSON.toJSON(userInfo));
	}
	
	@Test
	public void testQueryAll() {
		List<UserInfo> userInfos = userService.getUsers();
		logger.info(JSON.toJSON(userInfos));
	}
	
	@Test
	public void testInsert() {
		UserInfo userInfo = new UserInfo();
		userInfo.setUname("张三");
		userInfo.setUnumer(3);
		int num = userService.insert(userInfo);
		System.out.println(num);
	}
}
