package com.employee.repository;

import java.util.List;

import com.employee.dto.Employee;

public interface IEmployeeRepository {

	public Employee getEmployee(int employeeId);
	public Employee addEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public boolean deleteEmployee(int employeeId);
	
	
}
