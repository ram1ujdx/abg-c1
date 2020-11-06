<%@page import="javax.websocket.Session"%>
<%@page import="com.cg.web.model.Trainee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Trainee trainee=(Trainee)session.getAttribute("trainee"); %>

<h2>Hello <%=trainee.getGender().equals("male")?"Mr. ":"Ms. " %> <%=trainee.getTraineeName() %>,</h2>
<h3>Email : <%=trainee.getEmail() %></h3>
<h3>Languages : </h3>
<% for(String lang:trainee.getLanguages()) {
	out.print("<i>"+lang+",</i> ");
}
%>

</body>
</html>