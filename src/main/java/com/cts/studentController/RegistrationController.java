package com.cts.studentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.Model.Admin;
import com.cts.Model.LoginRequest;
import com.cts.Model.LoginResponce;
import com.cts.services.CustomUserDetailsService;
import com.cts.services.RegistrationService;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class RegistrationController {

	@Autowired
	private  RegistrationService registrationservice;
	
	@Autowired
	private CustomUserDetailsService customeservice;
	
	
	@PostMapping("/register")
	public  Admin  Register(@RequestBody Admin authentication)
	{   
		
		authentication.setId(null);
		return registrationservice.RegisterAdmin(authentication);
	}
	
	@PostMapping("/login")
	 public  LoginResponce login(@RequestBody  LoginRequest authentication )
	 {
		 return registrationservice.login(authentication);
	 }
	
	
}
