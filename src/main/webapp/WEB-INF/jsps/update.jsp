<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="updateform" method="post">
		<table>
			<tr>
				<td>Id</td>
				<td><input type="text" name="id" value="${patient.id}"></td>
			</tr>
			<tr>
				<td>First_Name</td>
				<td><input type="text" name="firstName" value="${patient.firstName}"></td>
			</tr>
			<tr>
				<td>Last_Name</td>
				<td><input type="text" name="lastName" value="${patient.lastName}"></td>
			</tr>
			<tr>
				<td>City</td>
				<td><input type="text" name="city" value="${patient.city}"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" value="${patient.email}"></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="number" name="mobile" value="${patient.mobile}"></td>
			</tr>
			<tr>
				<td>Fees</td>
				<td><input type="number" name="fees" value="${patient.fees}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="update"></td>
			</tr>
		</table>
	</form>
</body>
</html>