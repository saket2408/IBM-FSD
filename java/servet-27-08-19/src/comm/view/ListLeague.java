package comm.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.factory.MyConnectionFactory;
import comm.model.League;


public class ListLeague extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private List<League> list = null;
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			dolist(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			dolist(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
protected void dolist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		list = new ArrayList<League>();
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		Connection connection = MyConnectionFactory.getMySqlConnection();
		PreparedStatement ps = connection.prepareStatement("select * from league");
		ResultSet rs = ps.executeQuery();
		while (rs.next())
		{
			list.add(new League(rs.getString(2),
					rs.getString(3), Integer.parseInt(rs.getString(4))));
		}
		pw.println("<h1>list of leagues</h1>");
		pw.println("<table border=1><tr><th>TITLE</th><th>SEASON</th><th>YEAR</th></tr>");
		for(League l: list) {
			pw.println("<tr><td>"+l.getTitle()+"</td><td>"+l.getSeason()+"</td><td>"+l.getiYear()+"</td></tr>");
		}
		pw.println("</table>");
		pw.println("<br><a href='index.html'>return home</a>");
	}

}
