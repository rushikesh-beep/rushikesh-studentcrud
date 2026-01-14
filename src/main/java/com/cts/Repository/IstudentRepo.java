package com.cts.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cts.Model.StudentInfo;

@Repository
public interface IstudentRepo extends MongoRepository<StudentInfo ,   String> {

	
	
}
