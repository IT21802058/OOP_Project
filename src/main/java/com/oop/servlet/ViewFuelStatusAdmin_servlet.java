package com.oop.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import com.oop.model.Fuel;
import com.oop.service.addFuelOrderimpl;

/**
 * Servlet implementation class ViewFuelStatusAdmin_servlet
 */
public class ViewFuelStatusAdmin_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				response.getWriter().append("Served at: ").append(request.getContextPath());
				ArrayList<Fuel> fuel = addFuelOrderimpl.getFuelInfo();
				
				request.setAttribute("FuelInfo", fuel);
				
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/FuelShow.jsp");
				dispatcher.forward(request, response);
	}

}
