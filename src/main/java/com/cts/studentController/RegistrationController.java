package com.cts.studentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.Model.Authentication;
import com.cts.services.RegistrationService;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class RegistrationController {

	@Autowired
	private  RegistrationService registrationservice;
	
	
	@PostMapping("/register")
	public  Authentication  Register(@RequestBody Authentication authentication)
	{   
		
		authentication.setId(null);
		return registrationservice.RegisterAdmin(authentication);
	}
	
	@PostMapping("/login")
	 public  Authentication login(@RequestBody  Authentication authentication )
	 {
		 return registrationservice.login(authentication.getUsername(),authentication.getPassword());
	 }
	
	
}
