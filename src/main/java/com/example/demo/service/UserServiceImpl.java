package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.User;

public class UserServiceImpl implements UserService {
	
	private UserService userService;
	
	
	@Autowired
	public UserServiceImpl(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public User saveUser(User user) {
		
	User userSaved = userService.saveUser(user);
		
		return userSaved;
	}

	@Override
	public List<User> getAllUsers() {
		
		return userService.getAllUsers();
	}
	@Override
	public void deleteByUserId(Integer id) {

		userService.deleteByUserId(id);
	}

}
