package comm.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.dao.EmployeeDao;
import comm.dao.EmployeeDaoImpl;
import comm.model.Employee;

/**
 * Servlet implementation class ViewEmployee
 */
@WebServlet("/view_employee")
public class ViewEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Employee> list = null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			doAdd(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			doAdd(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doAdd(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html>\r\n" + 
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
				"<body>");
		pw.println("<a href='index.html' class='btn btn-info' role='button'>add new employee</a><br><br><br>");
		
		pw.println("<table class='table table-striped'><tr><th>ID</th><th>NAME</th><th>PASSWORD</th><th>EMAIL</th><th>COUNTRY</th><th>EDIT</th><th>DELETE</th></tr>");
		EmployeeDao emp = new EmployeeDaoImpl();
		list = emp.viewEmployee();
		if(!list.isEmpty()) {
			for(Employee l:list) {
				pw.println("<tr><td>"+l.getId()+"</td><td>"+l.getName()+"</td><td>"+l.getPassword()+"</td><td>"+l.getEmail()+"</td><td>"+l.getCountry()+"</td>"
						+ "<td><a href='edit.view?id="+l.getId()+ "' class='btn btn-warning' role='button'>edit</a></td>"
								+ "<td><a href='delete.view?id="+l.getId()+"' class='btn btn-danger' role='button'>delete</a></td></tr>");
			}
		}
		pw.println("</table>");
		
	}

}
