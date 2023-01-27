package com.prowings.service;

import com.prowings.model.Employee;

public interface EmployeeService {
	public void createEmployee(Employee employee);

	public Employee getEmployeeById(int id);

}
