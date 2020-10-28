package com.employee.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.employee.dto.Department;
import com.employee.dto.Employee;

public class EmployeeRepositoryImpl implements IEmployeeRepository {

	static List<Employee> employees=new ArrayList<Employee>();
	public EmployeeRepositoryImpl() {
		generateData();
	}
	
	public static void generateData() {
		
		Department d1=new Department(201, "IT", 5001);
		Department d2=new Department(202, "SALES", 7001);
		Department d3= new Department(203, "Manager", 8001);
		
		employees.add(new Employee(50011, 7001, "Tushar", "Reddy", "tushar@yahoo.com", "956532135", "Salesman", LocalDate.of(2002, 1, 20), 20000, d2));
		employees.add(new Employee(60011, 5001, "Pritam", "Dutta", "pritam@yahoo.com", "956532555", "Programmer", LocalDate.of(2012, 1, 20), 50000, d1));
		employees.add(new Employee(40012, 8001, "Rohit", "Reddy", "rohit@yahoo.com", "956532565", "Analyst", LocalDate.of(2005, 10, 20), 28000, d3));
		employees.add(new Employee(50012, 7001, "Mohit", "Bhatt", "mohit@yahoo.com", "856532135", "Product Manager", LocalDate.of(2008, 1, 20), 30000, d2));
		employees.add(new Employee(60012, 5001, "Mohan", "Sharma", "mohan@yahoo.com", "956532254", "QA", LocalDate.of(2008, 10, 10), 40000, d1));
	}
	
	
	@Override
	public Employee getEmployee(int employeeId) {
		
		return employees.stream().filter(emp->emp.getEmployeeId()==employeeId).findFirst().get();
		
	}

	@Override
	public Employee addEmployee(Employee employee) {
		
		employees.add(employee);
		return employee;
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return employees;
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		
		Employee employee=employees.stream().filter(emp->emp.getEmployeeId()==employeeId).findFirst().get();
		if(employee==null) {
			return false;
		}
		employees.remove(employee);
		return true;
	}

}
