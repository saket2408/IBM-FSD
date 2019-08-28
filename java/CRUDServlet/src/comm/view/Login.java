package comm.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doLogin(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doLogin(request, response);
	}

	private void doLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset='ISO-8859-1'>\r\n" + 
				"<title>Insert title here</title>\r\n" + 
				"<!-- Latest compiled and minified CSS -->\r\n" + 
				"<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css'>\r\n" + 
				"\r\n" + 
				"<!-- jQuery library -->\r\n" + 
				"<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js'></script>\r\n" + 
				"\r\n" + 
				"<!-- Popper JS -->\r\n" + 
				"<script src='https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js'></script>\r\n" + 
				"\r\n" + 
				"<!-- Latest compiled JavaScript -->\r\n" + 
				"<script src='https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js'></script>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"<h1>LOGIN</h1><br>\r\n" + 
				"\r\n" + 
				"	<form action='view_employee' method='post'>\r\n" + 
				"  <div class='form-group'>\r\n" + 
				"    <label for='name'>Name:</label>\r\n" + 
				"    <input type='name' class='form-control' id='name' name='name' required>\r\n" + 
				"  </div>\r\n" + 
				"  <div class='form-group'>\r\n" + 
				"    <label for='password'>Password:</label>\r\n" + 
				"    <input type='password' class='form-control' id='password' name='password' required>\r\n" + 
				"  </div>\r\n" + 
				"   \r\n" + 
				"  \r\n" + 
				"  <button type='submit' class='btn btn-primary'>Submit</button>\r\n" + 
				"</form>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>");
		
	}

}
