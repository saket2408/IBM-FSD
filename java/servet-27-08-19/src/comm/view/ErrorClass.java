package comm.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.model.League;

public class ErrorClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doError(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doError(request, response);
	}

	protected void doError(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		@SuppressWarnings("unchecked")
		List<String> list = (List<String>) request.getAttribute("error");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h1 style ='color : red'>ERRORS</h1>");
		for(String l : list) {
			pw.println(l);
			pw.println("<br>");
		}
		pw.println("<a href='add_league.html'>back to form</a>");
	}

}
