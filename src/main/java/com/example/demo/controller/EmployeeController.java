package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepo emp;
	
	@GetMapping("/employee")
	 public List<Employee> getEmployee(){
		return emp.findAll();
		
	}
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployeeId(@PathVariable long id){
		return emp.findById(id);
	}
}
