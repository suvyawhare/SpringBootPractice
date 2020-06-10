package com.sb.ex;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EmployeeDetails {
	@Id
	@Column
	String employeeId;
	@Column
	String employeeName;
	@Column
	String employeeProfile;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeProfile() {
		return employeeProfile;
	}

	public void setEmployeeProfile(String employeeProfile) {
		this.employeeProfile = employeeProfile;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeProfile="
				+ employeeProfile + "]";
	}
	
	
	

}
