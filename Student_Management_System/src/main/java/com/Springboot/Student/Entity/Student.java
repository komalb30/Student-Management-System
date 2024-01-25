package com.Springboot.Student.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "sname", nullable = false)
	private String sname;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "course")
	private String course;
	
	@Column(name = "fees")
	private String fees;
	
	@Column(name = "date")
	private String date;
	
	public Student() {
		
	}
	
	public Student(String sname, String email, String course, String fees, String date) {
		super();
		this.sname = sname;
		this.email = email;
		this.course = course;
		this.fees = fees;
		this.date = date;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}