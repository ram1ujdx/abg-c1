package com.employee.ui;

import java.util.Scanner;

import com.employee.dto.Employee;
import com.employee.service.EmployeeServiceImpl;
import com.employee.service.IEmployeeService;

public class EmployeeApp {

	public static void main(String[] args) {
		
		IEmployeeService service=new EmployeeServiceImpl();
		
		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter an id ");
//		int employeeId=scan.nextInt();
//		Employee emp=service.getEmployee(employeeId);
//		System.out.println(emp);
		
		service.findDeptNamesWithTotalEmployees().forEach((deptName,count)->System.out.println(deptName+" -- "+count));
		System.out.println("Sum of Salry = "+service.findSumOfSalary());
		
		

	}

}
