<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Patients</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>First_Name</th>
			<th>Last_Name</th>
			<th>City</th>
			<th>Email</th>
			<th>mobile</th>
			<th>Fees</th>
			<th>Action</th>
		</tr>
			<c:forEach items="${list}" var="patient">
				<tr>
					<td>${patient.id}</td>
					<td>${patient.firstName}</td>
					<td>${patient.lastName}</td>
					<td>${patient.city}</td>
					<td>${patient.email}</td>
					<td>${patient.mobile}</td>
					<td>${patient.fees}</td>
					<td>
						<a href="delete?id=${patient.id}">delete</a>
					 	<a href="update?id=${patient.id}">update</a>
					</td>
				</tr>
			</c:forEach>	
	</table>
</body>
</html>