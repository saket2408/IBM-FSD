package comm.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.model.League;


public class ListLeague extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private List<League> list = new ArrayList<League>();
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		dolist(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		dolist(request, response);
	}
	
protected void dolist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		list.add(new League("cricket", "winter", 2019));
		list.add(new League("soccer", "summer", 2018));
		list.add(new League("tennis", "spring", 2019));
		pw.println("<table border=1><tr><th>TITLE</th><th>SEASON</th><th>YEAR</th></tr>");
		for(League l: list) {
			pw.println("<tr><td>"+l.getTitle()+"</td><td>"+l.getSeason()+"</td><td>"+l.getiYear()+"</td></tr>");
		}
		pw.println("</table>");
	}

}
