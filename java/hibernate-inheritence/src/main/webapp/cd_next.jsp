<%@page import="comm.example.CD"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String title = request.getParameter("title");
		String artist = request.getParameter("artist");
		Date date = new SimpleDateFormat("dd-MM-yyyy").parse(request.getParameter("date"));
		double cost = Double.parseDouble(request.getParameter("cost"));
		String cd_type = request.getParameter("cd_type");
		session.setAttribute("cd_type", cd_type);
		session.setAttribute("CD", new CD(title, artist, date, cost));
	    System.out.println(cd_type);
	    
	%>
	
	<%
		if(cd_type.equals("international_cd"))
		{%>
		
			<form id="form-1" method="post" action="controller.do">
			<label for="input-1">languages:</label> <input id="input-1"
				name="language" type="text" /><br> <label for="input-2">region:</label>
			<input id="input-2" name="region" type="number" /><br> <input
				type="hidden" name="cd_type" value="internation_cd"> <input
				type="submit" value="Submit" id="button-1" />
		</form>	
		<% }%>
	

	<%
		if(cd_type.equals("special_edition_cd"))
		{%>
		<form id="form-1" method="post" action="controller.do">
			<label for="input-1">new features:</label> <input id="input-1"
				name="new_features" type="text" /><br> <input type="hidden"
				name="cd_type" value="special_edition_cd"> <input
				type="submit" value="Submit" id="button-1" />
		</form>
		<% }%>
</body>
</html>