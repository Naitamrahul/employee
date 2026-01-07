package com.EmployeeCRUD.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeCRUD.Entity.Employee;
import com.EmployeeCRUD.Service.EmployeeService;

@RestController
@RequestMapping("/")
public class EmployeeController {

	private EmployeeService empService;
	
	
	public EmployeeController(EmployeeService empService) {
		super();
		this.empService = empService;
	}


	@PostMapping("/add")
	public Employee create(@RequestBody Employee emp) {
		return empService.createEmployee(emp);
		
	}
	
}
