package com.cts.studentController;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.Model.Admin;
import com.cts.Model.StudentInfo;
import com.cts.services.studentService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class studentController {
@Autowired
	private studentService studentservice;
	
public studentController(studentService studentservice)
{
	this.studentservice=studentservice;
}
	
	
//	
//	@PostMapping("/savestudent")	 
//	public StudentInfo Registration(@RequestBody   StudentInfo studentinfo)
//	{        
//		studentinfo.setId(null);	
//		
//		return studentservice.Registration(studentinfo);
//		
//			
//		
//	}

	@GetMapping("/getstudent")
	public List<StudentInfo>   GetAllStudent()
	{
		return studentservice.GetAllStudent();
	}
	
	
	@PutMapping("/update/{id}")
	public StudentInfo  UpdateStudent(@PathVariable String id, @RequestBody StudentInfo studentinfo )
	{
		return studentservice.UpdateStudent(id,studentinfo);
	}
	
	@DeleteMapping("/delete/{id}")
	public  String DeleteStudent( @PathVariable  String id)
	{
		studentservice.deletestudent(id);
		
		return "delete";
	}
	@GetMapping("/search")
    public Page<StudentInfo> search(
            @RequestParam(required = false) String name,
            
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        return studentservice.search(name, page, size);
    }

	
	
}
