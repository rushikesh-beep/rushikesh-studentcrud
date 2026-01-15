package com.cts.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cts.Model.Authentication;
import com.cts.Model.StudentInfo;

@Repository
public interface IadminRegistration extends MongoRepository<Authentication ,  String> {

}
