<%@page import="org.springframework.ui.Model"%>
<%@page import="comm.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student detail</title>
</head>
<body>
your detail: <br>
first name: ${student.getFirstName()}<br>
last name: ${student.getLastName()}<br>
country: ${student.country}<br>
language: ${student.favLanguague}<br>
Operating System: [
<c:forEach var="a" items="${student.operatingSystem}">
${a} &nbsp;
</c:forEach>]

</body>
</html>