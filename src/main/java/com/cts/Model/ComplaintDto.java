package com.cts.Model;

import java.time.LocalDateTime;

public class ComplaintDto {
	
	
	public ComplaintDto(String status, String admincomment, LocalDateTime updatedAt) {
		super();
		this.status = status;
		this.admincomment = admincomment;
		this.updatedAt = updatedAt;
	}
	@Override
	public String toString() {
		return "ComplaintDto [status=" + status + ", admincomment=" + admincomment + ", updatedAt=" + updatedAt + "]";
	}
	
	  public ComplaintDto() {
	    }	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAdmincomment() {
		return admincomment;
	}
	public void setAdmincomment(String admincomment) {
		this.admincomment = admincomment;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	private String status ;
	private String admincomment;
    private LocalDateTime updatedAt;

}
