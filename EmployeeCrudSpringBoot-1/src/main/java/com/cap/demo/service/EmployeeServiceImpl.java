package com.cap.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.demo.entity.Employee;
import com.cap.demo.repository.EmployeeDao;

@Service("EmployeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao dao;
	@Override
	public Employee addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return dao.save(e);
	}

	@Override
	public Employee updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		return dao.save(e);
	}

	@Override
	public void deleteEmployee(int getId) {
		// TODO Auto-generated method stub
		dao.deleteById(getId);
	}

	@Override
	public Optional<Employee> displayEmployee(int getId) {
		// TODO Auto-generated method stub
		return dao.findById(getId);
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	public List<Employee> getAddress(String address)
	{
		return dao.findadress(address);
	}

	@Override
	public List<Employee> getSalaryBetween(Integer sal1, Integer sal2) {
		// TODO Auto-generated method stub
		return dao.findBySalaryBetween(sal1, sal2);
	}
	


	
	

}
