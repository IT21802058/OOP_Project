package com.oop.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Fuel_order;
import com.oop.service.addFuelOrderimpl;

@WebServlet("/DeleteOrderservlet")
public class DeleteOrderservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		boolean isTrue = addFuelOrderimpl.deleteOrder(id);

		if (isTrue==true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("deleteorder.jsp");
			dispatcher.forward(request, response);
		} else {
			ArrayList<Fuel_order> ordDetails = addFuelOrderimpl.getShowOrder();
			request.setAttribute("deleteOrder", ordDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("ShowOrder.jsp");
			dispatcher.forward(request, response);
		}
	}
}