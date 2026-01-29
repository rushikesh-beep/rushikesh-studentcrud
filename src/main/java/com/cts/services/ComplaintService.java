package com.cts.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.Model.ComplaintDto;
import com.cts.Model.ComplaintResponceDTO;
import com.cts.Model.Complaints;
import com.cts.Model.StudentInfo;
import com.cts.Repository.IcomplaintsRepo;
import com.cts.Repository.IstudentRepo;

@Service
public class ComplaintService {
	

    @Autowired
    private IstudentRepo studentrepo;

     @Autowired
	private IcomplaintsRepo complaintrepo;
	
	public Complaints InsertComplaints(Complaints complaints) {
		   complaints.setCreatedAt(LocalDateTime.now());
		   complaints.setStatus("PENDING");
		return complaintrepo.save(complaints);
	}

	public List<ComplaintResponceDTO> getComplaints() {

	    List<Complaints> complaints = complaintrepo.findAll();

	    return complaints.stream().map(c -> {

	        ComplaintResponceDTO dto = new ComplaintResponceDTO();

	        dto.setComplaintId(c.getId());
	        dto.setComplaintTitle(c.getComplaintTitle());
	        dto.setComplaintDescription(c.getComplaintDescription());
	        dto.setStatus(c.getStatus());
	        dto.setAdminComment(c.getAdminComment());
	        dto.setCreatedAt(c.getCreatedAt());
	        dto.setUpdatedAt(c.getUpdatedAt());

	        
	        if (c.getUserId() != null && !c.getUserId().isBlank()) {

	            studentrepo.findById(c.getUserId())
	            
	            
	                       .ifPresent(s -> dto.setStudentName(s.getName()));

	        } else {
	            dto.setStudentName("Unknown");
	        }

	        return dto;	

	    }).toList();
	}  
	
	

	public Complaints UpdateComlaint(String id, ComplaintDto complaindto) {
		
		
		Complaints c = complaintrepo.findById(id).   orElseThrow(() -> new RuntimeException("Complaint not found"));;
		
		c.setAdminComment(complaindto.getAdminComment());
		c.setStatus(complaindto.getStatus());
		c.setUpdatedAt(complaindto.getUpdatedAt());
		
		
		return complaintrepo.save(c);
	}

	public Complaints ComplaineDelete(String id) {
		 Complaints c = complaintrepo.findById(id)
                 .orElseThrow(() -> new RuntimeException("Not found"));
complaintrepo.deleteById(id);
return c; 
		
	}

	public List<Complaints> GetComplaintsByUserId(String userId) {
	
		return complaintrepo.findByUserId(userId);
	}

}
