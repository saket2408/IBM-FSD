package comm.view;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<String> list = null;

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

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		list = (List<String>) request.getAttribute("error");

		pw.println("<html>\r\n" + "<head>\r\n" + "<meta charset=\"ISO-8859-1\">\r\n" + "<title>add league</title>\r\n"
				+ "</head>\r\n" + "<body>\r\n" + "<h1>Add a new league</h1><div style='color:red'>");
		if (list != null) {
			for (String l : list) {
				pw.println(l);
				pw.println("<br>");
			}
		}
		pw.println("</div><form id='form-1' action='add_league.do' method='post'>\r\n"
				+ "	<label for='input-1'>enter the title:</label>\r\n"
				+ "	<input id='input-1' name='title' required='true' type='text'/><br>\r\n"
				+ "	<label for='input-2'>enter year:</label>\r\n"
				+ "	<input id='input-2' name='year' required='true' type='text'/><br>\r\n"
				+ "	<label for='input-3'>select season:</label>\r\n" + "	<select name='season' id='input-3'>\r\n"
				+ "		<option value='unknown'>--select season--</option>\r\n"
				+ "		<option value='winter'>winter</option>\r\n" + "		<option value='summer'>summer</option>\r\n"
				+ "		<option value='autumn'>autumn</option>\r\n" + "		<option value='spring'>spring</option>\r\n"
				+ "	</select><br><br>\r\n" + "	<input type='submit' value='add' id='button-1'/>\r\n" + "	&nbsp;\r\n"
				+ "	<input type='reset' value='Reset' id='button-2'/>\r\n" + "</form>\r\n" + "</body>\r\n" + "</html>");
	}

}
