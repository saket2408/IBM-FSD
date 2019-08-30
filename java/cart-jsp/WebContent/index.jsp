<%@page import="comm.model.Item"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.lang.reflect.Array"%>
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
<a href="viewCart.jsp" class="btn btn-warning">view Cart</a><br>
<h1>Select Items</h1><br>
<%
  Connection connection = MyConnectionFactory.getMySqlConnection();
List<Item> list = new ArrayList<Item>();
	Statement statement = connection.createStatement();
	ResultSet rs = statement.executeQuery("select * from items");
	while(rs.next()){
		list.add(new Item(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),"1"));
	}
	application.setAttribute("list", list);
%>


<c:forEach items="${list}" var="s">
	<div class="card" style="width:400px; display : inline-block; margin:20px; margin-left:30px">
	<form id="form-1" method="post" action="addCart.view">
    <div class="card-body">
    <h4 class="card-title">
		<input id="input-2" name="name"  type="text" value="${s.getName()}" style="background: none; border: none;" readonly/>
    </h4>
    <p class="card-text">
		<label for="input-3"><b>Description:</b></label>
		<input id="input-3" name="description" value="${s.getDiscription()}" type="text" style="background: none; border: none;" readonly/><br>
		<label for="input-4"><b>Price:</b> $</label>
		<input id="input-4"  type="text" name="price" value="${s.getPrice()}" style="background: none; border: none;" readonly/><br>
		<label for="input-5"><b>Category:</b> </label>
		<input id="input-5"  type="text" name="category" value="${s.getCategory()}" style="background: none; border: none;" readonly/><br>
    </p>
	
		<label for="input-1"><b>Quantity:<b/></label>
		<input id="input-1"  type="number" value="1" name="quantity"/><br><br>
		<input name="action" type="hidden" value="add"/>
		<input type="submit" value="Add to cart" class="btn btn-success" id="button-1"/>
	</form>
  </div>
</div>
</c:forEach>

</body>
</html>

