package com.college.service.studentService;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.hibernate.id.enhanced.ImplicitDatabaseObjectNamingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.entity.student.StudentEntity;
import com.college.enums.Status;
import com.college.enums.University;
import com.college.module.PasswordChange;
import com.college.repository.studentRepo.StudentRepo;

@Service
public class StudentServiceImple implements StudentService {
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public long addStudent(StudentEntity s) {
		s.setPassword(generatePassword(s));
		s.setCollegeId(generateCollegeId(s));
		return studentRepo.save(s).getStudentId();
	}

	@Override
	public StudentEntity findStudentById(long studentId) {
		Optional<StudentEntity> op = studentRepo.findById(studentId);
		if (op.isPresent()) {
			return op.get();
		}
		return null;
	}

	@Override
	public Status changePassword(PasswordChange passwordChange) {
		StudentEntity data = findStudentById(passwordChange.getStudentId());
		String newPass=passwordChange.getNewPass();
		if(Objects.nonNull(data)) {
			if(passwordChange.getOldPass().equals(data.getPassword())) {
				if(newPass.equals(passwordChange.getConfirmPass())) {
					data.setPassword(newPass);
					studentRepo.save(data);
					return Status.SUCCESS;
				}
			}
		}
		return Status.UNSUCCESS;
	}

	@Override
	public List<StudentEntity> showAll() {
		return studentRepo.findAll();
	}

	@Override
	public String generatePassword(StudentEntity s) {
		String[] name = s.getStudentName().split(" ");
		LocalDate dob = s.getDob();
		return name[0] + "@" + dob.getYear();
	}

	@Override
	public String generateCollegeId(StudentEntity s) {
		String[] email = s.getEmail().split("@");
		String university = s.getUniversity().toString().toLowerCase();
		return email[0] + "@" + university + "." + "in";
	}

	@Override
	public String updateStudentData(long studentId, StudentEntity s) {
		StudentEntity student = findStudentById(studentId);
		return null;
	}

	@Override
	public StudentEntity studentLogin(long studentId, String password) {
		StudentEntity student = findStudentById(studentId);
		if(student.getPassword().equals(password)) {
			return student;
			
		}
		
		return null;
	}

}
