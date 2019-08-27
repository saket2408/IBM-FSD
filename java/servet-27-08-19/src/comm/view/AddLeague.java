package comm.view;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.model.League;

public class AddLeague extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String title, season, year;
	int iYear;
	List<String> list = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doAdd(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doAdd(request, response);
	}

	protected void doAdd(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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
			RequestDispatcher r = request.getRequestDispatcher("success.view");
			r.forward(request, response);
		}
		else {
			request.setAttribute("error", list);
			RequestDispatcher r = request.getRequestDispatcher("error.view");
			r.forward(request, response);
		}
	}

}
