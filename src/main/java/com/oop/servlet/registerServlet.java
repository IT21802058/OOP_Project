package com.oop.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.oop.model.Customer;
import com.oop.service.CustomerImpl;
import com.oop.service.iCustomer;

/**
 * Servlet implementation class registerServlet
 */
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");

		iCustomer iCustomer = new CustomerImpl();
		
			if(iCustomer.checkNICExist(request.getParameter("nic"))) { //if user exists
				
				// Set response content type
			      response.setContentType("text/html");

			      PrintWriter out = response.getWriter();
			      out.println("<h1>Account Already Exists</h1>");
			}
			
			else {
				
			Customer customer = new Customer();
			
			customer.setNIC(request.getParameter("nic"));
			customer.setName(request.getParameter("name"));
			customer.setPhone(request.getParameter("phone"));
			customer.setEmail(request.getParameter("email"));
			customer.setUsername(request.getParameter("userName"));
			customer.setPassword(request.getParameter("password"));
			customer.setCity(request.getParameter("city"));
			
			iCustomer.addCustomer(customer);

			//RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/login.jsp");
			//dispatcher.forward(request, response);
			
			response.sendRedirect("Login.jsp");
		}
	

	}
}
