package com.datajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datajpa.entity.Employee;
import com.datajpa.service.EmployeeService;

@RestController
public class EmployeeCont {

	@Autowired
	private EmployeeService service;


	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee emp) {
		
		return service.saveEmployee(emp);
	}

}
