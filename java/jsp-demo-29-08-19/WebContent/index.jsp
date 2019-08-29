<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${error!=null}">
		<c:forEach var="s" items="${error}">
			*${s}
			<br>
		</c:forEach>
	</c:if>

	<%
		String msg = (String) request.getAttribute("success");
		if (msg != null) {
			out.print(msg);
		}
	%>
	<form id="form-1" method="post" action="check.do">
		<label for="input-1">Title:</label> <input id="input-1" type="text"
			name="title" required /> <br> <label for="input-2">year:</label>
		<input id="input-2" name="year" type="text" required /><br>
		Season: <select name="season">
			<option value="unknown">--select--</option>
			<option value="summer">Summer</option>
			<option value="winter">Winter</option>
			<option value="spring">Spring</option>
		</select> <input type="submit" value="submit" />
	</form> <br>
	
	<a href="login.jsp">click to login</a>
</body>
</html>