package edu.mum.lms.entity;

import java.util.List;

public class Employee extends Person {

	public Employee() {
	}

	private int employeeId;

	private String username;

	private String password;

	private List<EmployeeRole> roles;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<EmployeeRole> getRoles() {
		return roles;
	}

	public void setRoles(List<EmployeeRole> roles) {
		this.roles = roles;
	}
	
	public enum EmployeeRole {
	    Librarian, Administrator
	}

}