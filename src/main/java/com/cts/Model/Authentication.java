package com.cts.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="Admin")
public class Authentication {
	
	@Id
	private String id;
	private String username;
	private String password;
	private String Role;

}
