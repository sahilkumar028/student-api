package com.college.repository.studentRepo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.college.entity.student.StudentEntity;

public interface StudentRepo extends JpaRepositoryImplementation<StudentEntity, Long> {

}
