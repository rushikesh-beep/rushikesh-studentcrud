package com.cts.studentController;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.Model.StudentInfo;
import com.cts.services.studentService;

@Controller
public class studentController {
@Autowired
	private studentService studentservice;
	
public studentController(studentService studentservice)
{
	this.studentservice=studentservice;
}
	
	@GetMapping("/home")
	public String login()
	
	{
		
		return "home";
	}
	
	@GetMapping("/addfrom")
	public String addform(Model model)
	{
		 model.addAttribute("student", new StudentInfo());
		 return "addform";
	}
	@PostMapping("/savestudent")
	public String Registration(@ModelAttribute("student")   StudentInfo studentinfo)
	{
		
		
			studentservice.Registration(studentinfo);
			return "redirect:/home";
		
	}
	
	@GetMapping("/getstudent")
	public String GetStudent(Model model)
	
	{
		List<StudentInfo> studentinfo= studentservice.showallstudent();
		model.addAttribute("stud", studentinfo);
		return "listofstudent";
	}
	
}
