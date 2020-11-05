package com.cg.web;

import java.io.IOException;
import java.io.PrintWriter;

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
@WebServlet("/show")
public class ShowTraineeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		HttpSession session=request.getSession();
		ServletContext context=getServletContext();
		Trainee trainee=(Trainee) context.getAttribute("trainee");
		
		PrintWriter out=response.getWriter();
		out.println("Name : "+trainee.getTraineeName());
		out.println("Email : "+trainee.getEmail());
		out.println("Gender : "+trainee.getGender());
		out.println("Languages Known : ");
		
		for(String lang:trainee.getLanguages()) {
			out.println(lang);
		}
		
	}

}
