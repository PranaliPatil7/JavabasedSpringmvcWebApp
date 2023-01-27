package com.prowings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prowings.dao.EmployeeDao;
import com.prowings.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao dao;
	
	@Override
	public void createEmployee(Employee employee) {
		dao.createEmployee(employee);
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		return dao.getEmployeeById(id);
	}

	

}
	

	