package example;

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


/**
 * Servlet implementation class Check
 */
@WebServlet("/check.do")
public class Check extends HttpServlet {
	 int serialVersionUID=100;
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
				throws ServletException, IOException{
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
				request.setAttribute("success", "successfully registered");
				RequestDispatcher r = request.getRequestDispatcher("index.jsp");
				r.forward(request, response);
			}
			else {
				request.setAttribute("error", list);
				RequestDispatcher r = request.getRequestDispatcher("index.jsp");
				r.forward(request, response);
			}
		}

}
