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
	
	public  StudentInfo  Registration(StudentInfo studentinfo) {
		
	 
	  return  studentrepo.save(studentinfo);
	}

	public List<StudentInfo> GetAllStudent() {
	
		return studentrepo.findAll() ;
	}

		public StudentInfo UpdateStudent(String id, StudentInfo studentinfo) {
		
			StudentInfo student= studentrepo.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
			
			student.setName(studentinfo.getName());
			student.setCit(studentinfo.getCit());
			student.setCourse(studentinfo.getCourse());
			student.setFees(studentinfo.getFees());
			return studentrepo.save(student);
		}

		public String deletestudent(String id) {
			
			 studentrepo.deleteById(id); 
			 return "delete Succesfully";
		}

	
	
	
}
