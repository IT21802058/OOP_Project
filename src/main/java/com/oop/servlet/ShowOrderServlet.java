package com.oop.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.oop.model.Fuel_order;
import com.oop.service.addFuelOrderimpl;
import com.oop.service.ifuelorder;


public class ShowOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ShowOrderServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		ifuelorder iFuelorder = new addFuelOrderimpl();
		
		ArrayList<Fuel_order> fuelOrders = iFuelorder.getShowOrder();
		
		request.setAttribute("fuelOrders", fuelOrders);
		request.getRequestDispatcher("ShowOrder.jsp").forward(request, response);
		
		Fuel_order fuel = new Fuel_order();
		fuel.setProduct(request.getParameter("product"));
		fuel.setSize(Integer.parseInt(request.getParameter("size")));
		fuel.setQty(Integer.parseInt(request.getParameter("qty")));
		fuel.setName(request.getParameter("name"));
		fuel.setEmail(request.getParameter("email"));
		
		iFuelorder.addFuelOrder(fuel);
		response.sendRedirect("ShowOrderServlet");
	}

}
