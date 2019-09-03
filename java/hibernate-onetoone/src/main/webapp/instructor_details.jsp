<%@page import="comm.ibm.fsd.hibernate_onetoone.InstructorDetail"%>
<%@page import="comm.ibm.fsd.hibernate_onetoone.Instructor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String fname = request.getParameter("fname");
	String lname = request.getParameter("lname");
	String email = request.getParameter("email");
	session.setAttribute("I", new Instructor(fname,lname,email,new InstructorDetail()));

%>
<form id="form-1" action="controller.do" method="post">
	<label for="input-1">Youtube Channel:</label>
	<input id="input-1" name="yc" type="text"/><br>
	<label for="input-2">channel detail:</label>
	<input id="input-2" name="detail" type="text"/><br>
	<input type="submit" value="Submit" id="button-1"/>
</form>

</body>
</html>