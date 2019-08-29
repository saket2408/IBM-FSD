package comm.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.dao.EmployeeDao;
import comm.dao.EmployeeDaoImpl;
import comm.model.Employee;

/**
 * Servlet implementation class EditController
 */
@WebServlet("/edit.view")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<String> list = null;
       
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

	@SuppressWarnings("unchecked")
	protected void doAdd(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		Employee e = null;
		list = (List<String>) request.getAttribute("list");
		int id = Integer.parseInt(request.getParameter("id"));
		EmployeeDao emp = new EmployeeDaoImpl();
		e = emp.getEmploye(id);
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
				"<body>\r\n" + 
				"<h1>EDIT EMPLOYEE</h1><br>");
		
		if(list!=null) {

			for(String s: list) {
				
				pw.println("*"+s);
				pw.println("<br>");
			}
		}
		

				 
				pw.println("<form action='edit_employee.view?id="+e.getId()+"' method='post'>\r\n" + 
				"  <div class='form-group'>\r\n" + 
				"    <label for='name'>Name:</label>\r\n" + 
				"    <input type='name' class='form-control' id='name' name='name' value='"+e.getName()+"' required>\r\n" + 
				"  </div>\r\n" + 
				"  <div class='form-group'>\r\n" + 
				"    <label for='password'>Password:</label>\r\n" + 
				"    <input type='password' class='form-control' id='password' name='password' value='"+e.getPassword()+"' required>\r\n" + 
				"  </div>\r\n" + 
				"   <div class='form-group'>\r\n" + 
				"    <label for='email'>Email:</label>\r\n" + 
				"    <input type='email' class='form-control' id='email' name='email' value='"+e.getEmail()+"' required>\r\n" + 
				"  </div>\r\n" + 
				"  \r\n" + 
				"   <div class='form-group'>\r\n" + 
				"    <label for='country'>country:</label>\r\n" + 
				"    <select name='country'>"+
				"		<option value='unknown'>--select--</option>\r\n" + 
				"    	<option value='india'>India</option>\r\n" + 
				"    	<option value='pakistan'>Pakistan</option>\r\n" + 
				"    	<option value='USA'>USA</option>\r\n" + 
				"    	<option value='UK'>UK</option>\r\n" + 
				"    	<option value='others'>others</option>\r\n" + 
				"    </select>\r\n" + 
				"  </div>\r\n" + 
				"  \r\n" + 
				"  <button type='submit' class='btn btn-primary'>Submit</button>\r\n" + 
				"  <a href='login' class='btn btn-info' role='button'>view Employees</a>\r\n" + 
				"</form>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>");
	}
}
