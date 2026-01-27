package com.cts.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.Model.ComplaintDto;
import com.cts.Model.Complaints;
import com.cts.Repository.IcomplaintsRepo;

@Service
public class ComplaintService {
     @Autowired
	private IcomplaintsRepo complaintrepo;
	
	public Complaints InsertComplaints(Complaints complaints) {
		   complaints.setCreatedAt(LocalDateTime.now());
		   complaints.setStatus("PENDING");
		return complaintrepo.save(complaints);
	}

	public List<Complaints> getComplaints() {
	
		return complaintrepo.findAll();
	}

	public Complaints UpdateComlaint(String id, ComplaintDto complaindto) {
		
		
		Complaints c = complaintrepo.findById(id).   orElseThrow(() -> new RuntimeException("Complaint not found"));;
		
		c.setAdminComment(complaindto.getAdmincomment());
		c.setStatus(complaindto.getStatus());
		c.setUpdatedAt(complaindto.getUpdatedAt());
		
		
		return complaintrepo.save(c);
	}

}
