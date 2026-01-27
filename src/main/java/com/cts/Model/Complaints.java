package com.cts.Model;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "complaints")
public class Complaints {
	private String id;
	public Complaints(String id, String userId, String complaintTitle, String complaintDescription, String status,
			String adminComment, LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.id = id;
		this.userId = userId;
		this.complaintTitle = complaintTitle;
		this.complaintDescription = complaintDescription;
		this.status = status;
		this.adminComment = adminComment;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	@Override
	public String toString() {
		return "Complaints [id=" + id + ", userId=" + userId + ", complaintTitle=" + complaintTitle
				+ ", complaintDescription=" + complaintDescription + ", status=" + status + ", adminComment="
				+ adminComment + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
	public Complaints() {}
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	private String userId;
	private String complaintTitle;
	private String complaintDescription;
	private String status;
	private String adminComment;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
