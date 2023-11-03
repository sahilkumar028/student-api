package com.college.module;

import java.time.LocalDate;

import com.college.enums.Course;
import com.college.enums.Gender;
import com.college.enums.Mentor;
import com.college.enums.University;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class StudentResponse {
	private Long studentId;
	private String studentName;
	private String fatherName;
	private String motherName;
	private LocalDate dob;
	private long phoneNo;
	private String email;
	@Enumerated(EnumType.STRING)
	private Course course;
	@Enumerated(EnumType.STRING)
	private University university;
	@Enumerated(EnumType.STRING)
	private Mentor mentor;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	public Mentor getMentor() {
		return mentor;
	}
	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public StudentResponse(Long studentId, String studentName, String fatherName, String motherName, LocalDate dob,
			long phoneNo, String email, Course course, University university, Mentor mentor, Gender gender) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.dob = dob;
		this.phoneNo = phoneNo;
		this.email = email;
		this.course = course;
		this.university = university;
		this.mentor = mentor;
		this.gender = gender;
	}
	public StudentResponse() {
		
	}
}
