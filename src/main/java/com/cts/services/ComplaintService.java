package com.cts.services;

import org.springframework.stereotype.Service;

import com.cts.Model.Complaints;
import com.cts.Repository.IcomplaintsRepo;

@Service
public class ComplaintService {

	private IcomplaintsRepo complaintrepo;
	
	public Complaints InsertComplaints(Complaints complaints) {
		
		return complaintrepo.save(complaints);
	}

}
