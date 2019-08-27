package comm.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.model.League;


public class Success extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doSuccess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doSuccess(request, response);
	}

	protected void doSuccess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		League l  = (League) request.getAttribute("success");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h1 style = 'color:green'>ADDED SUCCESSFULLY</h1>");
		pw.println("<ol><li>title: "+l.getTitle()+"</li><li>season: "+l.getSeason()+"</li><li>year: "+l.getiYear()+"</li></ol>");
		pw.println("<br><a href='index.html'>return home</a>");
	}


}
