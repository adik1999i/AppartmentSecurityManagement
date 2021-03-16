package com.cap.demo.service;

import java.util.List;
import java.util.Optional;

import com.cap.demo.entity.Employee;

public interface EmployeeService {

    Employee addEmployee(Employee e);
	
	Employee updateEmployee(Employee e);
	
	void deleteEmployee(int getId);
	
	Optional<Employee> displayEmployee(int getId);
	
	List<Employee> getAll();
	
	public List<Employee> getAddress(String address);

	List<Employee> getSalaryBetween(Integer sal1,Integer sal2);
}
