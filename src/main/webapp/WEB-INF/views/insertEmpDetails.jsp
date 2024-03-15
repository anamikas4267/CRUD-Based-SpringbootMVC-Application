<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Management System</h1>
<h2 style="color: purple;">Welcome ${user.username} ! </h2>
<h2>Enter Employee Details</h2>
<br>
<spring:form action="./insertEmployee" method="post" modelAttribute="command">
Enter Employee id <spring:input type="number" path="empId"/><br><br>
Enter Employee name <spring:input type="text" path="empName"/><br><br>
Enter Employee department <spring:input type="text" path="empDepartment"/><br><br>
Enter Employee designation <spring:input type="text" path="empDesignation"/><br><br>
Enter Employee salary <spring:input type="number" path="empSalary"/><br><br>
<input type="submit" value="save"></input>
</spring:form>
<br>
<a href="./menu">Go Back to Menu</a>
</body>
</html>