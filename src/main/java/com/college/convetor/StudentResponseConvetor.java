package com.college.convetor;

import com.college.entity.student.StudentEntity;
import com.college.module.StudentResponse;

public class StudentResponseConvetor {
	public static StudentResponse studentResponseConvetor(StudentEntity s) {
		StudentResponse data = new StudentResponse();
		data.setStudentId(s.getStudentId());
		data.setStudentName(s.getStudentName());
		data.setFatherName(s.getFatherName());
		data.setMotherName(s.getMotherName());
		data.setDob(s.getDob());
		data.setPhoneNo(s.getPhoneNo());
		data.setEmail(s.getEmail());
		data.setCourse(s.getCourse());
		data.setUniversity(s.getUniversity());
		data.setMentor(s.getMentor());
		data.setGender(s.getGender());
		return data;
	}
}
