package com.employee.service;

import java.util.List;
import java.util.Map;

import com.employee.dto.Employee;

public interface IEmployeeService {

	public Employee getEmployee(int employeeId);
	public Employee addEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public boolean deleteEmployee(int employeeId);
	public double findSumOfSalary();
	public Map<String, Integer> findDeptNamesWithTotalEmployees();
	
}
