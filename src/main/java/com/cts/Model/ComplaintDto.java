package com.cts.Model;

import java.time.LocalDateTime;

public class ComplaintDto {
	
	
	public ComplaintDto(String status, String adminComment, LocalDateTime updatedAt) {
		super();
		this.status = status;
		this.adminComment = adminComment;
		this.updatedAt = updatedAt;
	}
	@Override
	public String toString() {
		return "ComplaintDto [status=" + status + ", admincomment=" + adminComment + ", updatedAt=" + updatedAt + "]";
	}
	
	  public ComplaintDto() {
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
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	private String status ;
	private String adminComment;
    private LocalDateTime updatedAt;

}
