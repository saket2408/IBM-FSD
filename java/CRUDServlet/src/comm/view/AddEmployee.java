package comm.view;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
import comm.factory.MyConnectionFactory;
import comm.model.Employee;

@WebServlet("/add_employee.view")
public class AddEmployee extends HttpServlet {
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
			emp.addEmployee(new Employee(1, name, password, email, country));
			request.setAttribute("list", list);
			RequestDispatcher r = request.getRequestDispatcher("register");
			r.forward(request, response);	
		}
		else {
			request.setAttribute("list", list);
			RequestDispatcher r = request.getRequestDispatcher("register");
			r.forward(request, response);	
		}

	}
}
