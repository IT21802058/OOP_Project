package com.oop.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import com.oop.model.Customer;
import com.oop.service.CustomerImpl;
import com.oop.service.iCustomer;

/**
 * Servlet implementation class DisplayCustomer
 */
public class DisplayCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		iCustomer iCustomer = new CustomerImpl();
		ArrayList<Customer> arrayList = iCustomer.getCustomerdeatails();
				
		request.setAttribute("cusDetails", arrayList);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ProfileDetails.jsp");
		dispatcher.forward(request, response);
	}

	/**;
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
