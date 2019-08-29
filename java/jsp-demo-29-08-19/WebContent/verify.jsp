<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<jsp:useBean id="u" class="example.Model" scope="page"/>
		<jsp:setProperty property="username" name="u"/>
		<jsp:setProperty property="password" name="u"/>
		
		username: <jsp:getProperty property="username" name="u"/><br>
		password: <jsp:getProperty property="password" name="u"/><br>
		
		<%
		int a=0;
		try{
		  a= u.verifyUser();}
		catch(Exception e){
			e.printStackTrace();
		}
		if(a==0){
			out.println("not valid user");
		}
		else{
			out.println("valid user");
			application.setAttribute("username", u.getUsername());
			application.setAttribute("password", u.getPassword());
		}
		%>
		
</body>
</html>