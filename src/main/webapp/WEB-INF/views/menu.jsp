<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu Page</title>
</head>
<body>
<h1>Employee Management System</h1>
<h2 style="color: purple;">Welcome ${user.username} ! </h2>
<a href="./insertEmpPage">Insert Employee</a><br><br>
<a href="./showAllEmployees">List All Employees</a><br><br>
<a href="./searchEmpPage">Search Employee</a><br><br>
<a href="./deleteEmpPage">Delete Employee</a><br><br>
<a href="./updateEmpSalary">Update Salary Of Employee</a><br><br>
<!--<a href="./logout">Logout</a><br><br>-->
</body>
</html>