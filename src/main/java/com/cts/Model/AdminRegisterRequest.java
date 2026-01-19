package com.cts.Model;

public class AdminRegisterRequest {
	private String name;
    private String username;
    private String password;
	public AdminRegisterRequest(String name, String username, String password) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
	}
	 public AdminRegisterRequest() {
	    }
	@Override
	public String toString() {
		return "AdminRegisterRequest [name=" + name + ", username=" + username + ", password=" + password
				+ ", getName()=" + getName() + ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
