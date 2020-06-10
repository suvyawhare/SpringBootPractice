package com.sb.ex;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<EmployeeDetails,Serializable>{
	
	public EmployeeDetails findByEmployeeName(String name);

}
