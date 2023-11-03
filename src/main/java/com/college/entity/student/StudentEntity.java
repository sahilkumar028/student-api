package com.college.entity.student;

import java.time.LocalDate;

import com.college.enums.Course;
import com.college.enums.Gender;
import com.college.enums.Mentor;
import com.college.enums.University;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class StudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;
	private String studentName;
	private String fatherName;
	private String motherName;
	private LocalDate dob;
	private long phoneNo;
	private String email;
	private String collegeId;
	private String password;
	@Enumerated(EnumType.STRING)
	private Course course;
	@Enumerated(EnumType.STRING)
	private University university;
	@Enumerated(EnumType.STRING)
	private Mentor mentor;
	@Enumerated(EnumType.STRING)
	private Gender gender;

	public StudentEntity() {
		
	}
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

	public String getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public StudentEntity(Long studentId, String studentName, String fatherName, String motherName, LocalDate dob,
			long phoneNo, String email, Course course, String collegeId, String password, University university,
			Mentor mentor, Gender gender) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.dob = dob;
		this.phoneNo = phoneNo;
		this.email = email;
		this.course = course;
		this.collegeId = collegeId;
		this.password = password;
		this.university = university;
		this.mentor = mentor;
		this.gender = gender;
	}

}
