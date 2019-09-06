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
<title>home</title>
</head>
<body>
	<h1>Welcome to spring-formtag-jdbc</h1>
	<hr>

	<form:form action="add" modelAttribute="employee">
first name: <form:input path="firstName" />
		<br>
last name: <form:input path="lastName" />
		<br>
email: <form:input path="email" />
		<input type="submit">
	</form:form>
	<br>
	<br>
	<hr>
	
	<h3>search list:</h3>
<form action="search" method="post">
 <input type="text" name="pattern"><br>
 <input type="submit">
</form>

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

</body>
</html>