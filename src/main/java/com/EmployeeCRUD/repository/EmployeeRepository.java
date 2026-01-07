package com.EmployeeCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeCRUD.Entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee,Long>{

}
