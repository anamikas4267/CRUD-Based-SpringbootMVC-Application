<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="css/style.css"></link>
</head>
<body>
<h2>Login to Employee Management System</h2>
<spring:form action="./loginCheck" method="post">
Enter Username : <spring:input type="text" path="username"/>
Enter Password : <spring:input type="password" path="password"/>
<input type="submit" value="Login">
</spring:form>
<br>
<h2 style="color: navy;">${msg}</h2>
</body>
</html>