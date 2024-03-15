
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
<h1>Employee Management System</h1>
<h2 style="color: purple;">Welcome ${user.username} ! </h2>
<%
		//Employee emp=(Employee)request.getAttribute("emp");
		//if(emp!=null){
		%>
	<c:if test="${not empty emp}">	
	<table border="1">
		<tr>
			<th>Employee Id</th>
			<th>Employee Name</th>
			<th>Employee Department</th>
			<th>Employee Designation</th>
			<th>Salary</th>
		</tr>
		<tr>
			<td>${emp.empId}</td>
			<td>${emp.empName}</td>
			<td>${emp.empDepartment}</td>
			<td>${emp.empDesignation}</td>
			<td>${emp.empSalary}</td>
		</tr>
	</table>
	</c:if>
	<%
	//}
	//else {
	%>
	<c:if test="${empty emp}">
	<h1>Employee Not found</h1>
	<%//} %>
	</c:if>
	<br><br>
<a href="./menu">Go Back to Menu</a>
</body>
</html>