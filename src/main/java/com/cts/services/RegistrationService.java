package com.cts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ExceptionHandler.HandlingExceptions;
import com.cts.ExceptionHandler.loginException;
import com.cts.Model.Authentication;
import com.cts.Repository.IadminRegistration;

@Service
public class RegistrationService {
@Autowired
	private IadminRegistration adminrepo;
	
	
	
	public  Authentication RegisterAdmin(Authentication authentication) {
	
        if (adminrepo.existsByUsername(authentication.getUsername())) {
            throw new HandlingExceptions("Username already exists");
        }
return  adminrepo.save(authentication);
	}



	public Authentication login(String username, String password) {
		
		Authentication admin=	 adminrepo.findByUsername(username) ;
		
		if(admin==null)
		{
			throw  new loginException("User Not Found");
		}
		
		if(!admin.getPassword().equals(password) )
		{
			throw new loginException("PassWord Is Incorrect");
		}
		return admin;
	}

}
