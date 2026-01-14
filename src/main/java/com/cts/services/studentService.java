package com.cts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.Model.StudentInfo;
import com.cts.Repository.IstudentRepo;
import java.util.List;





@Service
public class studentService {

	@Autowired
	private IstudentRepo studentrepo;
	
	public String Registration(StudentInfo studentinfo) {
		
	  studentrepo.save(studentinfo);
	  return"Succesfull";
	}

	public List<StudentInfo> showallstudent() {
	
		return  studentrepo.findAll();
	}

	
	
	
}
