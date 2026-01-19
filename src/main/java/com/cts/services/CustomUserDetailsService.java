package com.cts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cts.Model.Admin;
import com.cts.Repository.IadminRegistration;

@Service
public class CustomUserDetailsService   implements UserDetailsService  {
	@Autowired
	private IadminRegistration adminrepo;
	@Override
	  public UserDetails loadUserByUsername(String username)
	            throws UsernameNotFoundException {

		Admin user = adminrepo.findByUsername(username)
	                .orElseThrow(() ->
	                        new UsernameNotFoundException("User not found"));

	        return org.springframework.security.core.userdetails.User
	                .withUsername(user.getUsername())
	                .password(user.getPassword())
	                .roles(user.getRole().replace("ROLE_", ""))
	                .build();
	    }
	
}
