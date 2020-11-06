package com.cg.studentapp.controller;

import java.io.IOException;
import java.sql.SQLException;

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
@WebServlet("/add-student")
public class StudentRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	IStudentService service;
	
	@Override
	public void init() throws ServletException {
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studentName=request.getParameter("tstudentName");
		String studentId=request.getParameter("tstudentId");
		float marks=Float.parseFloat(request.getParameter("tmarks"));
		long phoneNo=Long.parseLong(request.getParameter("tphoneNo"));
		Student student=new Student(studentId,studentName,marks,phoneNo);
		
		try {
			service=new StudentServiceImpl();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			service.addStudent(student);
		} catch (SQLException e) {
			response.sendError(400);
		}
		HttpSession ssn=request.getSession();
		ssn.setAttribute("student", student);
		response.sendRedirect("view-student.jsp");		
	}

}
