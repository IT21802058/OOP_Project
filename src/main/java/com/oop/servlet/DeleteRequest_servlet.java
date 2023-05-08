package com.oop.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.oop.service.RequestService_interface;
import com.oop.service.RequestService_service;

/**
 * Servlet implementation class DeleteRequest_servlet
 */
public class DeleteRequest_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*declare variable for Printwriter, usful returns a printwriter object
		 *that can send character text
		 *useful is using js sysntex in line number 39 - 48
		 */
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//get value of the id from the form
		String serveNo = request.getParameter("ID");
		
		//creating a pbject using the interface
		RequestService_interface RSI = new RequestService_service();
		
		//calling the DeleteRequest function
		int result = RSI.DeleteRequest(serveNo);
		
		//check the result from DeleteRequest function
		if(result == 1) {
			//send the alert and navigation
			out.println("<script type='text/javascript'>");
			out.println("alert('Your Service Details Are Removed Successfully!!!')");
			out.println("location='Cmain.jsp'");
			out.println("</Script>");
		}else {
			//send the alert and navigation
			out.println("<script type='text/javascript'>");
			out.println("alert('Somethign went wrong.. please try again....!')");
			out.println("location='Service.jsp'");
			out.println("</Script>");
		}
	}

}
