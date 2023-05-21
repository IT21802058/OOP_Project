package com.oop.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import javax.servlet.RequestDispatcher;

import com.oop.util.DBConnection;

/**
 * Servlet implementation class updatepaymentservlet
 */
public class updatepaymentservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String NIC = request.getParameter("nic");
		String Name = request.getParameter("name");
		String Email = request.getParameter("email");
		String Bankname = request.getParameter("bankname");
		String Cardname = request.getParameter("cardname");
		String Cardnumber = request.getParameter("cardnumber");
		
		boolean isTrue;
		
		isTrue = DBConnection.updatePaymentdetails(NIC, Name, Email, Bankname, Cardname, Cardnumber);
		
		if(isTrue == true) {
			
			List<Payment_details> cusDetails = DBConnection.getPaymentByCustomer(NIC);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}
		else {
			List<Payment_details> cusDetails = DBConnection.getPaymentdetails(NIC);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}
	}

}

	