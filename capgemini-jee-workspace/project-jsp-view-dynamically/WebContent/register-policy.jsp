<%@page import="java.util.List"%>

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
<form action="policies">
Select a Segment <select name="business_segment">
<option>Bu_Auto</option>


</select>

<button type="submit">Select</button>
</form>

</div>

	

</div>
</div>

<ul>
<c:forEach var="question" items="${ques}">
<li><b>${question.polQuesDesc}</b></li>
<input type="radio" name="ques-${polQuesSeq}" value=${question.polQuesAns1}>${question.polQuesAns1}
<input type="radio" name="ques-${polQuesSeq}" value=${question.polQuesAns2}>${question.polQuesAns2}
<input type="radio" name="ques-${polQuesSeq}" value=${question.polQuesAns3}>${question.polQuesAns3}
<input type="radio" name="ques-${polQuesSeq}" value=${question.polQuesAns4}>${question.polQuesAns4}
</c:forEach>
<li>

</ul>



</body>
</html>