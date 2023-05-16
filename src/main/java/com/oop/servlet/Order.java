package com.oop.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.oop.model.Fuel_order;
import com.oop.service.FuelStorageImpl;
import com.oop.service.addFuelOrderimpl;
import com.oop.service.ifuelorder;


public class Order extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Order() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		ifuelorder iFuelorder =new addFuelOrderimpl();
		
		Fuel_order fuel = new Fuel_order();
		fuel.setProduct(request.getParameter("product"));
		fuel.setSize(Integer.parseInt(request.getParameter("size")));
		fuel.setQty(Integer.parseInt(request.getParameter("qty")));
		fuel.setName(request.getParameter("name"));
		fuel.setEmail(request.getParameter("email"));
		
		iFuelorder.addFuelOrder(fuel);
		response.sendRedirect("ShowOrder.jsp");
	}

}
