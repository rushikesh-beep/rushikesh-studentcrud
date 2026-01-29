package com.cts.Model;

import java.time.LocalDateTime;

public class ComplaintResponceDTO {
	
	
	 private String complaintId;
	    private String complaintTitle;
	    private String complaintDescription;
	    private String status;
	    private String adminComment;
	    private LocalDateTime createdAt;
	    private LocalDateTime updatedAt;

	    private String name;
	    private String department;
		public String getComplaintId() {
			return complaintId;
		}
		public void setComplaintId(String complaintId) {
			this.complaintId = complaintId;
		}
		public String getComplaintTitle() {
			return complaintTitle;
		}
		public void setComplaintTitle(String complaintTitle) {
			this.complaintTitle = complaintTitle;
		}
		public String getComplaintDescription() {
			return complaintDescription;
		}
		public void setComplaintDescription(String complaintDescription) {
			this.complaintDescription = complaintDescription;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getAdminComment() {
			return adminComment;
		}
		public void setAdminComment(String adminComment) {
			this.adminComment = adminComment;
		}
		public LocalDateTime getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(LocalDateTime createdAt) {
			this.createdAt = createdAt;
		}
		public LocalDateTime getUpdatedAt() {
			return updatedAt;
		}
		public void setUpdatedAt(LocalDateTime updatedAt) {
			this.updatedAt = updatedAt;
		}
		public String getStudentName() {
			return name;
		}
		public void setStudentName(String studentName) {
			this.name = studentName;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		@Override
		public String toString() {
			return "ComplaintResponceDTO [complaintId=" + complaintId + ", complaintTitle=" + complaintTitle
					+ ", complaintDescription=" + complaintDescription + ", status=" + status + ", adminComment="
					+ adminComment + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", studentName="
					+ name + ", department=" + department + "]";
		}
		public ComplaintResponceDTO(String complaintId, String complaintTitle, String complaintDescription,
				String status, String adminComment, LocalDateTime createdAt, LocalDateTime updatedAt,
				String studentName, String department) {
			super();
			this.complaintId = complaintId;
			this.complaintTitle = complaintTitle;
			this.complaintDescription = complaintDescription;
			this.status = status;
			this.adminComment = adminComment;
			this.createdAt = createdAt;
			this.updatedAt = updatedAt;
			this.name = studentName;
			this.department = department;
		}

		public ComplaintResponceDTO()
		{
			
		}
		}
		

