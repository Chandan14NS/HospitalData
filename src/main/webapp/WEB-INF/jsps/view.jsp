<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register here</title>
</head>
<body>
	<form action="saveform" method="post">
		<table>
			<tr>
				<td>First_Name</td>
				<td><input type="text" name="firstName"></td>
			</tr>
			<tr>
				<td>Last_Name</td>
				<td><input type="text" name="lastName"></td>
			</tr>
			<tr>
				<td>City</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="number" name="mobile"></td>
			</tr>
			<tr>
				<td>Fees</td>
				<td><input type="number" name="fees"></td>
			</tr>
			<tr>
				<td><input type="submit" value="save"></td>
			</tr>
		</table>
	</form>
</body>
</html>