package com.sptpc.story.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sptpc.story.domain.User;
import com.sptpc.story.persistence.UserMapper;


@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public int register(User user) {
		// TODO Auto-generated method stub
		return userMapper.insertUser(user);
	}

	public User getUserByNameAndPwd(String username, String password) {
		// TODO Auto-generated method stub
		User user= new User();
		user.setUsername(username);
		user.setPassword(password);
		return userMapper.queryUserByNameAndPwd(user);
	}
	
}
