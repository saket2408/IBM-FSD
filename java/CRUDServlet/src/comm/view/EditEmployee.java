package comm.view;

import java.io.IOException;
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

@WebServlet("/edit_employee.view")
public class EditEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<String> list = null;
	private String name;
	private String country;
	private String password;
	private String email;

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
		list = new ArrayList<String>();
		int id = Integer.parseInt(request.getParameter("id"));
		name = request.getParameter("name");
		country = request.getParameter("country");
		email = request.getParameter("email");
		if (country.equals("unknown")) {
			list.add("select country");
		}
		String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
		password = request.getParameter("password");
		if (!password.matches(pattern)) {
			list.add("password should contain atleast 1 capital letter , 1 symbol , and 8 characters long");
		}
		
		if(list.isEmpty()) {
			EmployeeDao emp = new EmployeeDaoImpl();
			emp.editEmploye(new Employee(id, name, password, email, country));
			request.setAttribute("list", list);
			RequestDispatcher r = request.getRequestDispatcher("view_employee");
			r.forward(request, response);	
		}
		else {
			request.setAttribute("list", list);
			RequestDispatcher r = request.getRequestDispatcher("edit.view");
			r.forward(request, response);	
		}

	}

}
