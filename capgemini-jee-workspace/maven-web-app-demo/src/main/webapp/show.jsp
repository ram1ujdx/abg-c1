<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<%
if(session.getAttribute("loggedIn")==null){
	response.sendRedirect("login.jsp");
}
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

%>

<a href="logout">Logout</a>

<button id="btnAdmin" disabled>Admin</button>
<button id="btnUser" disabled>User</button>
<button id="btnAgent" disabled>Agent</button>

</body>

<script type="text/javascript">
var userType='${userType}';
switch(userType){
	case 'Admin':
		document.getElementById('btnAdmin').disabled=false;
		break;
	case 'User':
		document.getElementById('btnUser').disabled=false;
		break;
	case 'Agent':
		document.getElementById('btnAgent').disabled=false;
		break;
}


</script>


</html>