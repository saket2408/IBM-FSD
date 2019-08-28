package comm.filter;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.DispatcherType;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import comm.dao.EmployeeDao;
import comm.dao.EmployeeDaoImpl;

/**
 * Servlet Filter implementation class Filter
 */
@WebFilter(dispatcherTypes = { DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.INCLUDE,
		DispatcherType.ERROR }, urlPatterns = { "/view_employee" })
public class Filter implements javax.servlet.Filter {

	/**
	 * Default constructor.
	 */
	public Filter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		EmployeeDao emp = new EmployeeDaoImpl();
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		int i = 0;
		try {
			i = emp.findEmploye(name, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (i == 0) {
			RequestDispatcher r = request.getRequestDispatcher("login");
			r.forward(request, response);

		} else {
			ServletContext context=request.getServletContext();
			context.setAttribute("name", name);
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
