package com.cts.studentController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.Model.Complaints;
import com.cts.services.ComplaintService;

@RestController
public class ComplaintsController {
	@Autowired
	private ComplaintService complaint;
	
	
	
	@PostMapping("/complaint")
	public Complaints InsertComplaints(@RequestBody Complaints complaints)
	{
		return complaint.InsertComplaints(complaints);
	}

}
