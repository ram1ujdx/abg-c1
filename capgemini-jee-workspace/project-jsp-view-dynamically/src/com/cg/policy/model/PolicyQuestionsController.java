package com.cg.policy.model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.policy.repo.PolicyQuestionsRepoImpl;

/**
 * Servlet implementation class PolicyQuestionsController
 */
@WebServlet("/policies")
public class PolicyQuestionsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	PolicyQuestionsRepoImpl repo=new PolicyQuestionsRepoImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String polSegment=request.getParameter("business_segment");
		try {
			List<PolicyQuestions> ques=repo.getPolicyQuestionsBySeq(polSegment);
			HttpSession ssn=request.getSession();
			ssn.setAttribute("ques", ques);
			request.getRequestDispatcher("register-policy.jsp").forward(request, response);
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
