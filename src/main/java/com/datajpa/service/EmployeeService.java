package com.datajpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datajpa.entity.Employee;
import com.datajpa.repo.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
 private EmployeeRepo repo;
	
	public Employee saveEmployee(Employee emp) {
		return repo.save(emp);
	}
}
