<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	out.println("WELCOME TO JSP");
%>
<h1>My Name is Duke, What's yours?</h1>
	<form id="form-1" method="post">
		<label for="input-1">Name :</label>
		<input id="input-1"  type="text" name="name"/>
		<input type="submit" value="Submit" id="button-1"/>
	</form>
	
	<c:if test="${fn:length(param.name) >0 }">
	<%@include file="process.jsp" %>
	</c:if>
</body>
</html>