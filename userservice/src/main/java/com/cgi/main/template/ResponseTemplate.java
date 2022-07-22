package com.cgi.main.template;

import com.cgi.main.entity.User;

public class ResponseTemplate {
	private User user;
	private Department department;

	public ResponseTemplate(User user, Department department) {
		super();
		this.user = user;
		this.department = department;
	}

	public ResponseTemplate() {
		super();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
