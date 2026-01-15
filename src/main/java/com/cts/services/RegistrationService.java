package com.cts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.Model.Authentication;
import com.cts.Repository.IadminRegistration;

@Service
public class RegistrationService {
@Autowired
	private IadminRegistration adminrepo;
	
	
	
	public static Authentication RegisterAdmin(Authentication authentication) {
	
		return null;
	}

}
