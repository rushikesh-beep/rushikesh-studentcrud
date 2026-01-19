package com.cts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cts.Model.AdminRegisterRequest;
import com.cts.Model.StudentInfo;
import com.cts.Repository.IstudentRepo;

@Service
public class AdminService {
	@Autowired
	private IstudentRepo studrepo;

    @Autowired
    private PasswordEncoder encoder;

	public void registerAdmin(AdminRegisterRequest req) {
		

		StudentInfo admin = new StudentInfo();
        admin.setName(req.getName());
        admin.setUsername(req.getUsername());
        admin.setPassword(encoder.encode(req.getPassword()));
        admin.setRole("ROLE_ADMIN");

        studrepo.save(admin);
    }
	}
