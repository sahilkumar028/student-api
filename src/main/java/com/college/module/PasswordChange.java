package com.college.module;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class PasswordChange {
	private Long studentId;
	private String oldPass;
	private String newPass;
	private String confirmPass;
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getOldPass() {
		return oldPass;
	}
	public void setOldPass(String oldPass) {
		this.oldPass = oldPass;
	}
	public String getNewPass() {
		return newPass;
	}
	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}
	public String getConfirmPass() {
		return confirmPass;
	}
	public void setConfirmPass(String confirmPass) {
		this.confirmPass = confirmPass;
	}
	public PasswordChange(Long studentId, String oldPass, String newPass, String confirmPass) {
		super();
		this.studentId = studentId;
		this.oldPass = oldPass;
		this.newPass = newPass;
		this.confirmPass = confirmPass;
	}
	public PasswordChange() {
		super();
	}
	
	
}
