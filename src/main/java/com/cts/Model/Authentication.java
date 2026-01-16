package com.cts.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Admin")
public class Authentication {

    @Id
    private String id;
    private String name;
    public Authentication(String id, String name, String username, String password, String role) {
		super();
		this.id = id;
		name = name;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	@Override
	public String toString() {
		return "Authentication [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", role=" + role + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	private String username;
    private String password;
    private String role;

   
    public Authentication() {
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
