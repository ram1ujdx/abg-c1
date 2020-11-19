package com.cg.maven.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/student")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger logger=LogManager.getLogger(StudentController.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("uName");
		String password=request.getParameter("password");
		String userType=request.getParameter("userType");
		if(userName.equals("admin1") && password.equals("12345")) {
		HttpSession ssn=request.getSession();
		ssn.setAttribute("loggedIn", userName);
		ssn.setAttribute("userType", userType);
		logger.info("User Ser to "+userType);
		response.sendRedirect("show.jsp");
		}
		else {
			response.sendRedirect("login.jsp");
		}
	}

}
