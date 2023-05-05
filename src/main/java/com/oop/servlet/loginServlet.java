package com.oop.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.oop.model.Customer;
import com.oop.model.Service;
import com.oop.service.Login_service;


/**
 * Servlet implementation class loginServlet
 */
public class loginServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException{
		//declare integer type variables
		int result1=0,result2=0;
		
		//begining try block
		try {
			/*declare variable for Printwriter, usful returns a printwriter object
			*that can send character text
			*useful is using js sysntex in line number 55 - 58
			*/
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
		
			//get the values from th form
			String EMAIL = request.getParameter("Lemail");
			String PWD = request.getParameter("Lpwd");
			String NIC = null;
				
				//calling the validate function
				result1 = Login_service.validate(EMAIL, PWD, "Cus");
				result2 = Login_service.validate(EMAIL, PWD, "Adm");
				
				//check the result from validate function
				if(result1 == 1) {
					RequestDispatcher dis = request.getRequestDispatcher("Cmain.jsp");
					dis.forward(request, response);
				}else if(result2 == 1) {
					RequestDispatcher dis = request.getRequestDispatcher("Amain.jsp");
					dis.forward(request, response);
				}else {
					//send the alert and navigation
					out.println("<script type='text/javascript'>");
					out.println("alert('Your Login Details Are Incorrect')");
					out.println("location='Login.jsp'");
					out.println("</Script>");
				}
				
				//calling the getNIC function
				NIC = Login_service.getNIC(EMAIL);
				
				//store the nic value in service model creating svsobject
				Service svc = new Service();
					svc.setNIC(NIC);
					
				Customer cus = new Customer();
					cus.setNIC(NIC);
				 
					
		}catch(IOException e) {
			//write in clonsole the location of the error
			System.out.println("error has occured in com.oop.servlet/LoginServlet.java");
			System.out.println(e);
		}
	}
}
