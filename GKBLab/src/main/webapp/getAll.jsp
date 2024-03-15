<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	
	<table border="3px" style="background-color: red; margin-left: 100px">
	<tr>
	<th>Name</th>
	<th>Email</th>
	<th>Age</th>
	<th>Date Of Birth</th>
	

	</tr>
	<c:forEach var="list" items="${list}">
	<tr>
	<td>${list.name}</td>
	<td>${list.email}</td>
	<td>${list.age}</td>
	<td>${list.dob}</td>

	
	
	</tr>
	</c:forEach>

	</table>
	
	
	
	

</body>
</html>