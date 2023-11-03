package com.college.service.studentService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.college.entity.student.StudentEntity;
import com.college.enums.Status;
import com.college.module.PasswordChange;
import com.college.module.StudentResponse;

@Service
public interface StudentService {
	public long addStudent(StudentEntity s);
	public StudentEntity findStudentById(long studentId);
	public Status changePassword(PasswordChange passwordChange);
	List<StudentEntity> showAll();
	String generatePassword(StudentEntity s);
	String generateCollegeId(StudentEntity s);
	String updateStudentData(long id,StudentEntity s);
	StudentEntity studentLogin(long studentId,String password);
}
