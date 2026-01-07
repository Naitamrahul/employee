package com.EmployeeCRUD.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeCRUD.Entity.Employee;
import com.EmployeeCRUD.repository.EmployeeRepository;

@Service
public class EmployeeService {

	//insert,update,delete,retrive
	@Autowired
	private EmployeeRepository empRepository;
	
	public Employee createEmployee(Employee employee) {
		return empRepository.save(employee);
	}
}
