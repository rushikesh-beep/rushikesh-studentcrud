package com.cts.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cts.Model.Admin;
import com.cts.Model.StudentInfo;

@Repository
public interface IadminRegistration extends MongoRepository<StudentInfo ,  String> {

	
	boolean existsByUsername(String username);
	
    Optional<StudentInfo> findByUsername(String username);
	
}
