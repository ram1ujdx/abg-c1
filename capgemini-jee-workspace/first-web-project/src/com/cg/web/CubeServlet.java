package com.cg.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CubeServlet
 */
@WebServlet("/cube")
public class CubeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//int sum=Integer.parseInt(request.getParameter("sum"));
		int sum=0;
		Cookie []cookies=request.getCookies();
		for(Cookie cookie:cookies) {
			if(cookie.getName().equals("cg.web.sum")) {
				sum=Integer.parseInt(cookie.getValue());
				break;
			}
		}
		
		int cube=sum*sum*sum;
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>Add Numbers</title></head>");
		out.println("<body bgColor='skyblue'>");
		out.println("<h1 style='color :blue;'>");
				out.println("Sum = "+sum);
				out.println("</h1>");
				out.println("<h1 style='color :green;'>");
				out.println("Cube = "+cube);
				out.println("</h1>");
				out.println("</body>");
				out.println("</html>");
		
	}

}
