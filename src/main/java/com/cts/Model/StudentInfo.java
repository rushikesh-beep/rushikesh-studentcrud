package com.cts.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Students")
public class StudentInfo {
     @Id
	private String id;
	private String name;
	public StudentInfo(String id, String name, String cit, String course, int fees) {
		super();
		this.id = id;
		this.name = name;
		this.cit = cit;
		this.course = course;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", name=" + name + ", cit=" + cit + ", course=" + course + ", fees=" + fees
				+ "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCit() {
		return cit;
	}
	public void setCit(String cit) {
		this.cit = cit;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	private String cit;
	private String  course;
	private int fees;
	public StudentInfo() {
    }
	
}
