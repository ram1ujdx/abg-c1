package com.cg.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/add", initParams = {
		@WebInitParam(name = "color", value = "red")
})
public class AdderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int x,y,sum;
		x=Integer.parseInt(request.getParameter("tnum1"));
		y=Integer.parseInt(request.getParameter("tnum2"));
		sum=x+y;
		String color=getInitParameter("color");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>Add Numbers</title></head>");
		out.println("<body bgColor='skyblue'>");
		out.println("<h1 style='color : " +color+ ";'>");
				out.println("Sum = "+sum);
				out.println("</h1>");
				out.println("</body>");
				out.println("</html>");
		
		
	}

}
