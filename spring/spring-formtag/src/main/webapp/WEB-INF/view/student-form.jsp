<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
first name: <form:input path="firstName"/><br>
last name: <form:input path="lastName"/><br>
Select your country:<form:select path="country">
    <form:options items="${student.countryOptions}"/>
</form:select><br>
Favorite language: <br>
JAVA<form:radiobutton path="favLanguague" value="java"/>
c++<form:radiobutton path="favLanguague" value="c++"/>
c##<form:radiobutton path="favLanguague" value="c##"/>
PHP<form:radiobutton path="favLanguague" value="php"/> <br>
Operating Systems:
Linux<form:checkbox path="operatingSystem" value="linux"/>
Mac OS<form:checkbox path="operatingSystem" value="mac os"/>
MS Windows<form:checkbox path="operatingSystem" value="ms windows"/>
<input type="submit">
</form:form>

</body>
</html>