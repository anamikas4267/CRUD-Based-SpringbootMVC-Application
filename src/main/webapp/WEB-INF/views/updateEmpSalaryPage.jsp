<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Salary</title>
</head>
<body>
<h1>Employee Management System</h1>
<h2 style="color: purple;">Welcome ${user.username} ! </h2>
<spring:form action="./updateSalary" method="post" modelAttribute="command">
Enter Employee Id To Update Salary<spring:input path="empId"/>
<br><br>
Enter the Salary<spring:input path="empSalary"/>
<br><br>
<input type="submit" value="UPDATE">
</spring:form>
<br><br>
<a href="./menu">Go Back to Menu</a>
</body>
</html>