package com.cg.studentapp.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.cg.studentapp.model.Student;
import com.cg.studentapp.service.IStudentService;
import com.cg.studentapp.service.StudentServiceImpl;

/**
 * Servlet implementation class StudentRegistrationController
 */
@WebServlet({"/add-student","/view-student","/view-all","/delete"})
public class StudentRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	IStudentService service;
	
	@Override
	public void init() throws ServletException {
		
		try {
			service=new StudentServiceImpl();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uri=request.getRequestURI();
		if(uri.contains("/add-student")) {
			addSudent(request, response);
		}
				
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri=request.getRequestURI();
		if(uri.contains("/view-student")) {
			try {
				viewStudent(request, response);
			} catch (SQLException e) {
				response.sendError(500);
			}
			
		}
		else if(uri.contains("/view-all")) {
			try {
				viewAllStudent(request, response);
			} catch (SQLException e) {
				response.sendError(500);
			}
		}
		else if(uri.contains("/delete")) {
			try {
				deleteStudent(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void addSudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String studentName=request.getParameter("tstudentName");
		String studentId=request.getParameter("tstudentId");
		float marks=Float.parseFloat(request.getParameter("tmarks"));
		long phoneNo=Long.parseLong(request.getParameter("tphoneNo"));
		Student student=new Student(studentId,studentName,marks,phoneNo);
		
		
		
		try {
			service.addStudent(student);
		} catch (SQLException e) {
			response.sendError(400);
		}
		HttpSession ssn=request.getSession();
		ssn.setAttribute("student", student);
		response.sendRedirect("view-student.jsp");		
	}
	
	protected void viewStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
			String studentId=request.getParameter("tstudentId");
			Student student=service.getStudent(studentId);
			HttpSession ssn=request.getSession();
			ssn.setAttribute("student", student);
			response.sendRedirect("view-student.jsp");	
	}
	
	protected void viewAllStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		
		List<Student> students=service.getAllStudents();
		HttpSession ssn=request.getSession();
		ssn.setAttribute("students", students);
		response.sendRedirect("view-all.jsp");	
}
	
	protected void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		String studentId=request.getParameter("studentId");
		service.deleteStudent(studentId);
		System.out.println("Student with ID "+studentId+" Deleted");
		response.sendRedirect("add-student.jsp");	
}
	
}
