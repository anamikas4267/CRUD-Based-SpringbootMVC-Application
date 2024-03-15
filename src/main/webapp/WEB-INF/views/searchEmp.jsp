<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Employee</title>
</head>
<body>
<h1>Employee Management System</h1>
<h2 style="color: purple;">Welcome ${user.username} ! </h2>
<h2>Enter Employee Id To Be Searched</h2>
<br><br>
<spring:form action="./search" method="post">
<input type="text" name="empId">
<br><br>
<input type="submit" value="SUBMIT">
</spring:form>
<br><br>
<a href="./menu">Go Back to Menu</a>
</body>
</html>