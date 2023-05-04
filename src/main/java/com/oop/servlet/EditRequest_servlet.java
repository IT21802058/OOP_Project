package com.oop.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import com.oop.service.RequestService_service;

/**
 * Servlet implementation class EditRequest_servlet
 */
public class EditRequest_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*declare variable for Printwriter, usful returns a printwriter object
		*that can send character text
		*useful is using js sysntex in line number 42 - 51
		*/
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//get the values from th form
		String serveNo = request.getParameter("ID");
		String VLttrs = request.getParameter("Vletters");
		String VNbr = request.getParameter("VNumber");
		String type = request.getParameter("servicetype");
		String date = request.getParameter("serviceday");
		
		//calling the EditRequest function
		int result = RequestService_service.EditRequest(serveNo,VLttrs,VNbr,type,date);
		
		//check the result from EditRequest function
		if(result == 1) {
			//send the alert and navigation
			out.println("<script type='text/javascript'>");
			out.println("alert('Your Service Details Are Updated Successfully!!!')");
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
