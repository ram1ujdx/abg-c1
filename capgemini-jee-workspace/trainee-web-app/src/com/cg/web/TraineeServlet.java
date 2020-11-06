package com.cg.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.web.model.Trainee;

/**
 * Servlet implementation class TraineeServlet
 */
@WebServlet("/trainee")
public class TraineeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String traineeName=request.getParameter("traineeName");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		
		String []languages=request.getParameterValues("languages");
		
		Trainee trainee=new Trainee(traineeName, email, gender, languages);
//		ServletContext context=getServletContext();
//		context.setAttribute("trainee", trainee);
		HttpSession session=request.getSession();
		session.setAttribute("trainee", trainee);
		response.sendRedirect("show-trainee.jsp");
		
//		RequestDispatcher dispatcher=request.getRequestDispatcher("show");
//		
//		request.setAttribute("trainee", trainee);
//		
//		dispatcher.forward(request, response);
		
		
	}

}
