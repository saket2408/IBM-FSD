<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRM-Tool</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>

<h1>Add Customer</h1>
<hr>
<br>
<form:form action="save" modelAttribute="customer">
	 <div class="form-group">
    <label for="fname">First Name:</label>
    <form:input path="firstName"/>
  </div>
  <div class="form-group">
    <label for="lname">last name:</label>
    <form:input path="lastName"/>
  </div>
  <div class="form-group">
    <label for="email">Email:</label>
    <form:input path="email"/>
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form:form>
<br><br>
<a href="/" class="btn btn-info" role="button">back to home</a>
</body>
</html>