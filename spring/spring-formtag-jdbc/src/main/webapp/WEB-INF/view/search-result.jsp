<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>search</title>
</head>
<body>
	<h1>search results</h1>
	<hr>

<hr>

	<table border=1>
		<tr>
		<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
		</tr>
		<c:forEach var="e" items="${list}">
			<tr>
			<td>${e.id}</td>
				<td>${e.firstName}</td>
				<td>${e.lastName}</td>
				<td>${e.email}</td>
			</tr>
		</c:forEach>

	</table>
	<br>
	<a href="/">back to home</a>

</body>
</html>