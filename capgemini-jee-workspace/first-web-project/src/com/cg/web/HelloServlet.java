package com.cg.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name=req.getParameter("tname");
		PrintWriter out=res.getWriter();
		out.println("Hello "+name);
		
	}
	
	
}
