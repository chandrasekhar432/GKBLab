<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="WebForm.css" rel='stylesheet' type="text/css">
</head>
<body>

	<form action="save" modelAttribute="web" onsubmit="return validateForm()">
        <h4>Web Form</h4>
        <label for="name">Name:</label> <br>
        <input type="text" name="name" id="name" placeholder="enter name" required> <br>
        <div></div>

        <label for="email">Email:</label> <br>
        <input type="email" name="email" id="email" placeholder="enter email"> <br>
        <div id="div1"></div>

        <label for="age">Age:</label> <br>
        <input type="text" name="age" id="age" placeholder="enter age"> <br>
        <div id="div2"></div>

        <label for="dob">Date Of Birth:</label> <br>
        <input type="date" name="dob" id="dob"  required> <br>
        <div></div> <br>

        <button id="btn">Submit</button> <br>
        
        <div id="div"><a href="getAll">GetAll</a></div>
    </form>
    
    
	
		
	<script type="text/javascript" src="WebForm.js"></script>

</body>
</html>