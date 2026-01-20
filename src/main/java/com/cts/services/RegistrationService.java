package com.cts.services;

import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cts.ExceptionHandler.HandlingExceptions;
import com.cts.ExceptionHandler.loginException;
import com.cts.Model.Admin;
import com.cts.Model.LoginRequest;
import com.cts.Model.LoginResponce;
import com.cts.Model.StudentInfo;
import com.cts.Model.UserRegisterRequest;
import com.cts.Repository.IadminRegistration;
import com.cts.springsecurity.JwtUtil;

@Service
public class RegistrationService {
@Autowired
	private IadminRegistration adminrepo;
private final PasswordEncoder passwordEncoder;
	
@Autowired
private AuthenticationManager authenticationManager;

@Autowired
private JwtUtil jwtUtil;




public RegistrationService(IadminRegistration adminrepo,
                   PasswordEncoder passwordEncoder) {
    this.adminrepo = adminrepo;
    this.passwordEncoder = passwordEncoder;
}
	



	public  String RegisterAdmin(UserRegisterRequest request) {
		  if (adminrepo.existsByUsername(request.getUsername())) {
		        throw new HandlingExceptions("Username already exists");
		    }

		    StudentInfo user = new StudentInfo();
		    user.setName(request.getName());
		    user.setUsername(request.getUsername());
		    user.setPassword(passwordEncoder.encode(request.getPassword()));
		    user.setCity(request.getCity());
		    user.setCourse(request.getDepartment());
		    user.setFees(request.getFees().toString());
		    user.setRole("ROLE_USER");

		    adminrepo.save(user);
		    return "Success";
    }
	


	
	
	
	
	
	

    public LoginResponce login(LoginRequest request) {

       
        authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(
                request.getUsername(),
                request.getPassword()
            )
        );

       
        StudentInfo admin = adminrepo.findByUsername(request.getUsername())
                .orElseThrow(() -> new RuntimeException("User not found"));

     
        String token = jwtUtil.generateToken(admin.getUsername(),admin.getRole());

       
        return new LoginResponce(
                token,
                admin.getUsername(),
                admin.getRole()
        );
    }
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//
//
//	public Admin login(String username, String password) {
//		
//		Admin admin=	 adminrepo.findByUsername(username) ;
//		
//		if(admin==null)
//		{
//			throw  new loginException("User Not Found");
//		}
//		
//		if(!admin.getPassword().equals(password) )
//		{
//			throw new loginException("PassWord Is Incorrect");
//		}
//		return admin;
//	}


