package com.college.repository.adminRepo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.college.entity.admin.Admin;

public interface AdminRepo extends JpaRepositoryImplementation<Admin, String> {

}
