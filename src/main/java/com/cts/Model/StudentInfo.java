package com.cts.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Students")
public class StudentInfo {
     @Id
	private String id;
	private String name;
	private  String course;
	private String city;
	private String fees;
	private String username;
	private String password;
	private String role;
	public StudentInfo(String id, String name, String course, String city, String fees, String username,
			String password, String role) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.city = city;
		this.fees = fees;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	public StudentInfo() {}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", name=" + name + ", course=" + course + ", city=" + city + ", fees=" + fees
				+ ", username=" + username + ", password=" + password + ", role=" + role + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
