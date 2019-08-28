package comm.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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
 * Servlet implementation class DeleteEmployee
 */
@WebServlet("/delete.view")
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int id;
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
	
		id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		EmployeeDao emp = new EmployeeDaoImpl();
		emp.deleteEmployee(id);
		RequestDispatcher r = request.getRequestDispatcher("view_employee");
		r.forward(request, response);	
	}
}
