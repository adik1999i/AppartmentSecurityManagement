package com.cap.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cap.demo.entity.Employee;

@Repository
 public interface EmployeeDao extends JpaRepository<Employee,Integer>{

	@Query("select e from Employee e where e.address= :address ")
	List<Employee> findadress(@Param("address") String address);
	List<Employee> findBySalaryBetween(Integer sal1,Integer sal2);
}
