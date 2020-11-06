<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
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

<table class="table">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Marks</th>
		<th>Phone No.</th>
	</tr>
	
	
	<tr>
		<td>${student.studentId}</td>
		<td>${student.studentId} </td>
		<td>${student.marks} </td>
		<td>${student.phoneNo} </td>
	</tr>
	
	</table>
	

</div>
</div>
</div>

</body>
</html>