<%@page import="java.util.ArrayList"%>
<%@page import="comm.model.Item"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="comm.factory.MyConnectionFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Items</title>
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
<a href="index.jsp" class="btn btn-warning">Shop more</a><br><br>
<h1>Your Cart</h1> 
<table class="table table-hover">
    
      <tr>
        <th>Product Name</th>
        <th>Description</th>
        <th>Price</th>
        <th>Category</th>
         <th>Quantity</th>
      </tr>
  
<c:if test="${cart!=null}">
 <c:forEach items="${cart}" var="c">
  <tr>
        <td>${c.getName()}</td>
        <td>${c.getDiscription()}</td>
        <td>${c.getPrice()}</td>
        <td>${c.getCategory()}</td>
         <td>${c.getQuantity()}</td>
      </tr>
 </c:forEach>
</c:if>

<c:if test="${cart==null}">
	<tr>
	<td>No items in cart</td>
	</tr>
</c:if>
</body>
</html>