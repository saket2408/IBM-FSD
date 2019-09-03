<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form id="form-1" action="cd_next.jsp" method="post">
		<label for="input-1">title:</label>
		<input id="input-1" name="title" type="text"/><br>
		<label for="input-2">Artist:</label>
		<input id="input-2" name="artist" type="text"/><br>
		<label for="input-3">purchase Date:</label>
		<input id="input-3" name="date" type="date"/><br>
		<label for="input-4">cost:</label>
		<input id="input-4" name="cost" type="number"/><br>
		select CD type:
		<select name="cd_type">
		<option value="international_cd">INTERNATIONAL CD</option>
		<option value="special_edition_cd">SPECIAL EDITION CD</option>
		</select><br>
		<input type="submit" value="Submit" id="button-1"/>
	</form>

</body>
</html>