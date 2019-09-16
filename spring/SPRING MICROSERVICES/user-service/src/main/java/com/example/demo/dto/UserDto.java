package com.example.demo.dto;

public class UserDto {
	private String lastName;
	private String firstName;
	private String email;
	private String password;
	private String userId;

	public UserDto() {
		super();
		
	}
	public UserDto(String lastName, String firstName, String email, String password,String userId) {
		super();
		
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.password = password;
		this.userId=userId;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	


}
