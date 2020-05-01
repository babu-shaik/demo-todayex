package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping(value = "save")
public class UserController {

	private UserService service;

	public UserController(UserService service) {
		super();
		this.service = service;
	}
	
	@RequestMapping(value = "user")
	public ResponseEntity<User> saveUser(@RequestBody User user){
		
		ResponseEntity resonseEntity;
		try {
			  service.saveUser(user);
			  resonseEntity = new ResponseEntity<String>("user saved",HttpStatus.CREATED);
		
		}catch(Exception e) {
			System.out.println(e);
			resonseEntity = new ResponseEntity<String>("can not save",HttpStatus.CONFLICT);
		}
		
		return resonseEntity;
	}
}
