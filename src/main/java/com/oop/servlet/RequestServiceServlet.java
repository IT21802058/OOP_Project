package com.oop.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.oop.model.Service;
import com.oop.service.RequestService_service;

/**
 * Servlet implementation class RequestServiceServlet
 */
public class RequestServiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
				/*declare variable for Printwriter, usful returns a printwriter object
				 *that can send character text
				 *useful is using js sysntex in line number 45 - 65
				 */
				PrintWriter out = response.getWriter();
				response.setContentType("text/html");
				
				//get the values from th form
				String VLttrs = request.getParameter("Vletters");		
				String VNbr = request.getParameter("VNumber");
				String type = request.getParameter("servicetype");
				String date = request.getParameter("serviceday");
				
				//get the nic value from the serivice model
				String nic = Service.getNIC(); 
				
				//calling the validate function
				int rslt = RequestService_service.validateRequest(nic, VLttrs, VNbr, type, date);
				
				//check the result from validate function
				if (rslt == 1) {
					//send the alert and navigation
					out.println("<script type='text/javascript'>");
					out.println("alert('Your Service Details Are All Ready Submited')");
					out.println("location='RequestService.jsp'");
					out.println("</Script>");
				}
				else {
					int insertRslt = RequestService_service.InsertRequest(nic, VLttrs, VNbr, type, date);
					
						if (insertRslt == 1) {
							//send the alert and navigation
							out.println("<script type='text/javascript'>");
							out.println("alert('Your Service Details Are Inserted')");
							out.println("location='Cmain.jsp'");
							out.println("</Script>");
						}
						else {
							//send the alert and navigation
							out.println("<script type='text/javascript'>");
							out.println("alert('Error occur.. please try again..')");
							out.println("location='RequestService.jsp'");
							out.println("</Script>");
						}
				}
				
	}
			

}

	


