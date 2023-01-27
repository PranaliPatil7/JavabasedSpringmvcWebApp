package com.prowings.dao;

import com.prowings.model.Employee;

public interface EmployeeDao {

	public void createEmployee(Employee employee);

	public Employee getEmployeeById(int id);
}
