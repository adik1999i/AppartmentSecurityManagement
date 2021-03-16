package com.cap.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.demo.entity.Employee;
import com.cap.demo.service.EmployeeService;

import io.swagger.annotations.ApiOperation;



@Controller
@RestController
@RequestMapping("/employee")

public class EmployeeController {

	@Autowired
	EmployeeService service;
	@ApiOperation(value="ADD EMPLOYEE")
	@PostMapping("/addEmployee")
	public void  addEmployee(@RequestBody Employee e)
	{
		 service.addEmployee(e);
		
	}
	@ApiOperation(value="UPDATE EMPLOYEE")
	@PutMapping("/updateEmployee")
	public void updateEmployee(@RequestBody Employee e)
	{
		service.updateEmployee(e);
	}
	
	@ApiOperation(value="DELETE EMPLOYEE")
	@DeleteMapping("/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable("id") int getId)
	{
		service.deleteEmployee(getId);
	}
	
	@ApiOperation(value="GET EMPLOYEE BY ID")
	@GetMapping("/getEmployeeId/{id}")
	public Optional<Employee> getEmployeeId(@PathVariable("id") int getId)
	{
		return service.displayEmployee(getId);
	}
	
	@ApiOperation(value="GET ALL EMPLOYEES")
	@GetMapping("/getAll")
	List<Employee> getAllEmployee()
	{
		return service.getAll();
	}
	
	@ApiOperation(value="GET ADDRESS")
	@GetMapping("/getAdd/{add}")
	List<Employee> getAddress(@PathVariable("add") String address)
	{
		return service.getAddress(address);
	}
	
	@ApiOperation(value="GET SALARY BETWEEN 2 NUMBERS")
	@GetMapping("/getsal/{sal1}/{sal2}")
	List<Employee> getSalaryBetween(@PathVariable("sal1") Integer sal1,@PathVariable("sal2") Integer sal2)
	{
		return service.getSalaryBetween(sal1, sal2);
	}
}
