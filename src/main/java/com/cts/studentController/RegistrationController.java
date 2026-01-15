package com.cts.studentController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.Model.Authentication;
import com.cts.services.RegistrationService;

@RestController
public class RegistrationController {

	@Autowired
	private  RegistrationService registrationservice;
	
	public  Authentication  Register(@RequestBody Authentication authentication)
	{
		return RegistrationService.RegisterAdmin(authentication);
	}
	
}
