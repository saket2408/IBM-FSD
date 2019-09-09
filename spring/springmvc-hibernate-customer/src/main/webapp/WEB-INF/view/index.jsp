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

<h1>Customer Relationship Manager Tool</h1>
<hr>
<br>
<a href="addForm" class="btn btn-info" role="button">Add Customer</a>

<form action="search" method="post" style="float:right;">
	<input type="text" name="key">&nbsp;<input type="submit" class="btn btn-success" value="search">
</form>

<table class="table table-striped">
      <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
        <th></th>
        <th></th>
      </tr>
      
     <c:forEach var="a" items="${list}">
     	<tr>
        <td>${a.firstName}</td>
        <td>${a.lastName}</td>
        <td>${a.email}</td>
        <td><a href="delete?id=${a.id}" onclick="alert('are you sure')" class="btn btn-danger" role="button">Delete</a></td>
        <td><a href="update?id=${a.id}" class="btn btn-warning" role="button">Update</a></td>
      </tr>
     
     </c:forEach>
     </table>

</body>
</html>