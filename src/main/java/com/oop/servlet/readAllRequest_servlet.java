package com.oop.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import jakarta.servlet.RequestDispatcher;
import com.oop.model.Service;
import com.oop.service.RequestService_interface;
import com.oop.service.RequestService_service;

/**
 * Servlet implementation class readAllRequest_servlet
 */
public class readAllRequest_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//creating a pbject using the interface
		RequestService_interface RSI = new RequestService_service();
		
		ArrayList<Service> service = RSI.getAllServices();
		
		request.setAttribute("myAllRequests", service);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Service.jsp");
		dispatcher.forward(request, response);
	}

	

}
