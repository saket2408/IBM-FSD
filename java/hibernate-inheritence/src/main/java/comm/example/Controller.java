package comm.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cd_type = request.getParameter("cd_type");
		HttpSession session = request.getSession();
		CD cd = (CD)session.getAttribute("CD");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		if (cd_type.equals("internation_cd")) {
			String language = request.getParameter("language");
			int region = Integer.parseInt(request.getParameter("region"));
			CDImpl comm = new CDImpl();
			comm.addInternational(new InternationalCD(cd.getTitle(),cd.getArtist(),cd.getPurchaseDate(),cd.getCost(),language,region));
			pw.println("added");
			pw.println(cd.getTitle()+" "+cd.getArtist()+" "+cd.getPurchaseDate()+ " "+cd.getCost()+" "+language+" "+region);
		}
		else {
			String newfeatures = request.getParameter("new_features");
			CDImpl comm = new CDImpl();
			comm.addSpecial(new SpecialEditionCD(cd.getTitle(),cd.getArtist(),cd.getPurchaseDate(),cd.getCost(),newfeatures));
			pw.println("added");
			pw.println(cd.getTitle()+" "+cd.getArtist()+" "+cd.getPurchaseDate()+ " "+cd.getCost()+" "+newfeatures);
		}
	}

}
