<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.oop.model.Service" %>
<%@ page import = "com.oop.servlet.DeleteRequest_servlet" %>
<%@ page import = "com.oop.servlet.readAllRequest_servlet" %>
<%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
	<style>
	table, th, td{
	 border: 1px solid black;
	}
	</style>
	<link rel="stylesheet" href="css/Requestservice.css"/>
	<link rel="stylesheet" href="css/index.css"/>
	<link rel="stylesheet" href="css/Servicelist.css"/>
	<meta charset="UTF-8">
	<title>Service</title>
</head>
<body>
	<%@ include file = "jsp/header.jsp" %>
	<div class ="nav">
	<header>
		<ul>
			<li><a href="Cmain.jsp"> Home </a></li>
			<li><a href=""> About </a></li>
			<li><a href=""> Contact us </a></li>
			<li><a href="Login.jsp"> Log in </a></li>
		</ul>
	</header>
	</div>
	<div class="container1">
	<h1><center>My services</center></h1><br>
	
		<table style = "width:100%;">
			<tr>
				<th>Service Number</th>
				<th>Vehicle Letters</th>
				<th>Vehicle Number</th>
				<th>Service Type<br>(1 = Full service, 2 = Car wash)</th>
				<th>Date</th>
				<th>Update</th>
				<th>Remove</th>
			</tr>
		<%
			ArrayList<Service> serviceArray = new ArrayList<Service>();
			serviceArray = (ArrayList<Service>)request.getAttribute("myAllRequests");
			
			int i = 0;
			
			while( i < serviceArray.size()){
				Service service = serviceArray.get(i);
		%>
		<tr>
		<td><%=service.getServeNo() %></td>
		<td><%=service.getVehicleLetters() %></td>
		<td><%=service.getVehicleNum() %></td>
		<td><%=service.getServiceType() %></td>
		<td><%=service.getDate() %></td>
		<td><a href = "EditService.jsp?id=<%=service.getServeNo() %>"><button class="servicebutn">Edit</button></a></td>
		<td><form method="post" class="Delete_form" action="DeleteRequest_servlet">
			<input type="hidden" name = "ID" value = "<%=service.getServeNo() %>">
			<input type="submit" class="servicebutn" value="Delete" name="btnSubmit">
			</form>		
		</td>
		</tr>
		<%
			i++;
			}
		%>
	</table>
	<br>
	<center>
		<a href = "RequestService.jsp"><button class="servicebutn" style = "width:50%;">Request another service</button></a>
	</center>
	</div>
	<%@ include file = "jsp/footer.jsp" %>
</body>
</html>