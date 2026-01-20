package com.cts.studentController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.Model.AdminRegisterRequest;
import com.cts.services.AdminService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/auth")
public class AdminController {
	@Autowired
	private AdminService adminservice;

    @PostMapping("/register-admin")
    public String registerAdmin(@RequestBody AdminRegisterRequest req) {
    	adminservice.registerAdmin(req);
        return "Admin Created";
    }
    
    
}
