package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	
	private String name;
	private String phone;
	private String age;
	private String dept;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public User(String name, String phone, String age, String dept) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.dept = dept;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "User {name=" + name + ", phone=" + phone + ", age=" + age + ", dept=" + dept + "}";
	}
	
	

}
