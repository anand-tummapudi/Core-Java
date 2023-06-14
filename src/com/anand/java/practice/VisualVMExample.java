package com.anand.java.practice;

import java.util.ArrayList;
import java.util.List;

public class VisualVMExample {

	public static void main(String[] args) throws InterruptedException {
			System.out.println("Application Started...");
		List<User> userList = new ArrayList<>();
		
		for(int i=0;i<10000;i++) {
			userList.add(new User("User"+i,"sample@samplemail.com"));
		}
	}

}

class User{
	
	private String userName;
	private String email;
	
	
	public User(String userName, String email) {
		super();
		this.userName = userName;
		this.email = email;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
