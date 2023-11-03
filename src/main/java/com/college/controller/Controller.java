package com.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.college.convetor.StudentResponseConvetor;
import com.college.entity.student.StudentEntity;
import com.college.enums.Status;
import com.college.module.PasswordChange;
import com.college.module.StudentResponse;
import com.college.service.studentService.StudentService;

@RestController
@RequestMapping("/erp")
public class Controller {
	@Autowired
	private StudentService studentService;

	@PostMapping("/admission")
	public long postStudent(@RequestBody StudentEntity s) {
		return studentService.addStudent(s);
	}

	@GetMapping("/find-student/{studentId}")
	public StudentResponse getStudentById(@PathVariable long studentId) {
		return StudentResponseConvetor.studentResponseConvetor(studentService.findStudentById(studentId));
	}

	@PostMapping("/change-password")
	public Status changePassword(@RequestBody PasswordChange passwordChange) {
		return studentService.changePassword(passwordChange);
	}

	@GetMapping("/getAll")
	List<StudentEntity> showAll() {
		return studentService.showAll();
	}
	@GetMapping("/student-login")
	public StudentEntity studentLogin(@RequestParam long studentId,@RequestParam String password) {
		return studentService.studentLogin(studentId, password);
	}
}
