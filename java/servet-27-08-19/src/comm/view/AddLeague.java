package comm.view;

import java.util.List;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.factory.MyConnectionFactory;
import comm.model.League;

public class AddLeague extends HttpServlet {
	 int serialVersionUID=100;
	String title, season, year;
	int iYear;
	List<String> list = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			doAdd(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			doAdd(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doAdd(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		list = new ArrayList<String>();
		title = request.getParameter("title");
		if (title.length() < 5) {
			list.add("title cannot be too short..");
		}

		year = request.getParameter("year");
		try {
			iYear = Integer.parseInt(year);
		} catch (Exception e) {
			list.add("year must be numeric..");
		}

		season = request.getParameter("season");
		if (season.equals("unknown")) {
			list.add("select proper season");
		}
		
		if(list.isEmpty()) {
			request.setAttribute("success", new League(title, season, iYear));
			Connection connection = MyConnectionFactory.getMySqlConnection();
			PreparedStatement ps = connection.prepareStatement("select uid from league order by uid desc limit 1");
			ResultSet rs = ps.executeQuery();
			rs.next();
			serialVersionUID = rs.getInt(1)+1;
			ps = connection.prepareStatement("insert into league(title,season,years,uid) values(?,?,?,?)");
			ps.setString(1, title);
			ps.setString(2, season);
			ps.setString(3, year);
			ps.setInt(4, serialVersionUID);
			serialVersionUID = serialVersionUID + 1;
			ps.executeUpdate();
			RequestDispatcher r = request.getRequestDispatcher("success.view");
			r.forward(request, response);
		}
		else {
			request.setAttribute("error", list);
			RequestDispatcher r = request.getRequestDispatcher("add_league.view");
			r.forward(request, response);
		}
	}

}
