package com.employee.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.employee.dto.Employee;
import com.employee.exception.InvalidSalaryException;
import com.employee.repository.EmployeeRepositoryImpl;
import com.employee.repository.IEmployeeRepository;

public class EmployeeServiceImpl implements IEmployeeService {

	IEmployeeRepository repo=new EmployeeRepositoryImpl();
	
	@Override
	public Employee getEmployee(int employeeId) {
		
		return repo.getEmployee(employeeId);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		if(employee.getSalary()<5000) {
			throw new InvalidSalaryException("Invalid Salary");
		}
		return repo.addEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return repo.getAllEmployees();
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		
		return repo.deleteEmployee(employeeId);
	}

	@Override
	public double findSumOfSalary() {
		
		return repo.getAllEmployees().stream().map(emp->emp.getSalary()).reduce((salary,sum)->salary+sum).get();
		
	}

	@Override
	public Map<String, Integer> findDeptNamesWithTotalEmployees() {
		Map<String, Integer> deptNames= new HashMap<String, Integer>();
		repo.getAllEmployees().forEach((emp)->
		{
			String deptName=emp.getDepartment().getDepartmentName();
			if(deptNames.containsKey(deptName)) {
				int empCount=deptNames.get(deptName)+1;
				deptNames.put(deptName, empCount);
			}
			else {
				deptNames.put(deptName, 1);
			}
		}
				
		);
		return deptNames;
	}

}
