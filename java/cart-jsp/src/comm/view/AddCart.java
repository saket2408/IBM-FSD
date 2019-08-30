package comm.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import comm.model.Item;

@WebServlet("/addCart.view")
public class AddCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String name;
	private String discription;
	private String price;
	private String category;
	private String quantity;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doResponse(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doResponse(request, response);
	}

	protected void doResponse(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equals("add")) {
			doAdd(request, response);
		} else {
			doRemove(request, response);
		}
	}

	private void doRemove(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		List<Item> list = (List<Item>) session.getAttribute("cart");
		try {
			name = request.getParameter("name");
			for (Item i : list) {
				if (i.getName().equals(name)) {
					list.remove(i);
				}
			}
			if (list.isEmpty()) {
				session.setAttribute("cart", null);
				RequestDispatcher rs = request.getRequestDispatcher("viewCart.jsp");
				rs.forward(request, response);
			} else {
				session.setAttribute("cart", list);
				RequestDispatcher rs = request.getRequestDispatcher("viewCart.jsp");
				rs.forward(request, response);
			}
			
		} catch (Exception e) {
			if (list.isEmpty()) {
				session.setAttribute("cart", null);
				RequestDispatcher rs = request.getRequestDispatcher("viewCart.jsp");
				rs.forward(request, response);
			} else {
				session.setAttribute("cart", list);
				RequestDispatcher rs = request.getRequestDispatcher("viewCart.jsp");
				rs.forward(request, response);
			}
		}

	}

	@SuppressWarnings("unchecked")
	private void doAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		List<Item> list = null;
		name = request.getParameter("name");
		discription = request.getParameter("description");
		price = request.getParameter("price");
		category = request.getParameter("category");
		quantity = request.getParameter("quantity");
		list = (List<Item>) session.getAttribute("cart");
		if (list == null) {
			list = new ArrayList<Item>();
			list.add(new Item(name, discription, price, category, quantity));
			session.setAttribute("cart", list);
			RequestDispatcher rs = request.getRequestDispatcher("viewCart.jsp");
			rs.forward(request, response);
		} else {
			boolean flag = false;
			for (Item i : list) {
				if (i.getName().equals(name) && i.getCategory().equals(category)) {
					int a = Integer.parseInt(i.getQuantity()) + Integer.parseInt(quantity);
					i.setQuantity("" + a + "");
					flag = true;
				}
			}
			if (flag == false) {
				list.add(new Item(name, discription, price, category, quantity));
			}
			session.setAttribute("cart", list);
			RequestDispatcher rs = request.getRequestDispatcher("viewCart.jsp");
			rs.forward(request, response);
		}

	}

}
