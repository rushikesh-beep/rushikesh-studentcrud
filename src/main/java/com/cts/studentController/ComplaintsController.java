package com.cts.studentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.Model.ComplaintDto;
import com.cts.Model.ComplaintResponceDTO;
import com.cts.Model.Complaints;
import com.cts.services.ComplaintService;

@RestController
@RequestMapping("/complaintbox")

public class ComplaintsController {
	@Autowired
	private ComplaintService complaint;
	
	
	
	@PostMapping("/complaint")
	public Complaints InsertComplaints(@RequestBody Complaints complaints)
	{
		return complaint.InsertComplaints(complaints);
	}
	@GetMapping("/getcomplaint")
	public List<ComplaintResponceDTO> getComplaints()
	{
		return  complaint.getComplaints();
	}
	
	@PutMapping("/updatestatus/{id}")
	public Complaints UpdateComlaint(@PathVariable String id, @RequestBody ComplaintDto complaindto)
	{
		return complaint.UpdateComlaint(id,complaindto);
	}
       @DeleteMapping("/delete/{id}")
	public Complaints ComplaineDelete(@PathVariable  String id)
	{
		return complaint.ComplaineDelete(id);
	}
	
}
