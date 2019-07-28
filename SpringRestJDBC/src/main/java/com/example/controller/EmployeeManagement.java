package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeManagementService;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeManagement {
	@Autowired
	EmployeeManagementService employeeService;
	
	@GetMapping(path="/")
	public String init() {
		return "INIT";
	}
	
	 @PostMapping(path= "/addEmployee", consumes = "application/json", produces = "application/json")
	 public String addEmployee(@RequestBody Employee employee) {
		 Boolean flag=employeeService.addEmployeeService(employee);
		 if(flag==true)
			 return "Sucess";
		 else
			 return "false";
		 
	 }

}
