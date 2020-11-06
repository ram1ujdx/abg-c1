<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<form class="form-group" action="add-student" method="post">
<label for="studentId">Enter ID</label>
<input type="text" name="tstudentId" class="form-control">
<label for="studentName">Enter Name</label>
<input type="text" name="tstudentName" class="form-control">
<label for="marks">Enter Marks</label>
<input type="number" name="tmarks" class="form-control">
<label for="phoneNo">Enter ID</label>
<input type="text" name="tphoneNo" class="form-control">
<button type="submit" class="btn btn-dark">Register Student</button>

</form>
</div>
</div>
</div>
</body>
</html>