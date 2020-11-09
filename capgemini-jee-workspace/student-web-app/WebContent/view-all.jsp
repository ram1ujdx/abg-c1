<%@page import="java.util.List"%>
<%@page import="com.cg.studentapp.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

<div class="container">
<div class="row">
<div class="col-12">
<div class="col-12">
<jsp:include page="header.jsp"></jsp:include>
</div>
<table class="table">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Marks</th>
		<th>Phone No.</th>
	</tr>
	
	<c:forEach var="student" items="${students}">
	<tr>
	<td>${student.studentId}</td>
		<td>${student.studentName} </td>
		<td>${student.marks} </td>
		<td>${student.phoneNo} </td>
	</tr>
	</c:forEach>
	
	<!-- 
	
	for(Student student:(List<Student>)session.getAttribute("students")){
		out.print("<tr>");
		out.print("<td>"+student.getStudentId()+"</td>");
		out.print("<td>"+student.getStudentName()+"</td>");
		out.print("<td>"+student.getMarks()+"</td>");
		out.print("<td>"+student.getPhoneNo()+"</td>");
		out.print("<td><a href='delete?studentId="+student.getStudentId()+"'>Delete</a></td>");
		out.print("</tr>");}

	
	-->
	
	</table>
	

</div>
</div>
</div>

</body>
</html>