package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.EmployeeManagementDAO;
import com.example.model.Employee;

public class EmployeeManagementServiceImpl implements EmployeeManagementService{

	@Autowired 
	EmployeeManagementDAO employeeDao;
	@Override
	public Boolean addEmployeeService(Employee employee) {
		
		return employeeDao.addEmployeeDAO(employee);
	}
	

}
