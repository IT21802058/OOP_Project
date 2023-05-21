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
import com.oop.service.ifuelorder;

/**
 * Servlet implementation class UpdateStorageaddservlet
 */
public class UpdateStorageaddservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStorageaddservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int ltr = Integer.parseInt(request.getParameter("addfuel"));
		String type = request.getParameter("fType");
		
		System.out.println(type);
		
		Fuel editfuel = new Fuel(type,ltr);
		ifuelorder iFuelorder = new addFuelOrderimpl();
		iFuelorder.addFuel(editfuel);
		
		ArrayList<Fuel> fuel = addFuelOrderimpl.getFuelInfo();
		
		request.setAttribute("FuelInfo", fuel);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/FuelShow.jsp");
		dispatcher.forward(request, response);
	}

}
