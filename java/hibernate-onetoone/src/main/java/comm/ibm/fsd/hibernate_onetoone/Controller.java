package comm.ibm.fsd.hibernate_onetoone;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/controller.do")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		PrintWriter pw = response.getWriter();
		String yc = request.getParameter("yc");
		String details = request.getParameter("detail");
		Instructor instructor = (Instructor) session.getAttribute("I");
		instructor.setDetail(new InstructorDetail(yc , details));
		InstructorImpl impl = new InstructorImpl();
		impl.addInstructor(instructor);
		pw.println("in controller");
		RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
		rd.include(request, response);
		
	}

}
