<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import="com.oop.model.Fuel_order" %>
   <%@page import="java.util.ArrayList" %>
   
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order History</title>
<link rel="stylesheet" href="css/index.css"/>
<link rel="stylesheet" href="css/ShowOrder.css"/>

</head>
<body>
	<%@ include file = "jsp/header.jsp" %>
	<jsp:include page="/ShowOrderServlet"></jsp:include>
	<div class ="nav">
	<header>
		<ul>
			<li><a href="index.jsp"> Home </a></li>
			<li><a href=""> About </a></li>
			<li><a href=""> Contact us </a></li>
			<li><a href="Amain.jsp">Dashboard</a></li>
		</ul>
	</header>
	</div>
	<div class="square">
	<div>
	<%ArrayList<Fuel_order> fuel = new ArrayList<Fuel_order>();
	fuel = (ArrayList<Fuel_order>)request.getAttribute("fuelOrders");%>
	
	
	<table>
	  <tr>
	    <th>Id</th>
	    <th>Fuel Type</th>
	    <th>Bowser Size</th>
	    <th>Qty.</th>
	    <th>Name</th>
	    <th>e-Mail</th>
	    <th></th>
	  </tr>
	  <%for(int i=0; i<fuel.size(); i++){ 
	  Fuel_order fuel_order = fuel.get(i);%>
	  <tr>
	    <td><%=fuel_order.getId()%> </td>
	    <td><%=fuel_order.getProduct()%></td>
	    <td><%=fuel_order.getSize()%></td>
	    <td><%=fuel_order.getQty()%></td>
	    <td><%=fuel_order.getName()%></td>
	    <td><%=fuel_order.getEmail()%></td>
	    
	    
	    <td><a href="DeleteOrderservlet?id=<%=fuel_order.getId()%>">
	    <input type="button" name="delete" value="Delete" class="Delete"></a>
	    <!-- <td><button class="delete">Delete</button></td> -->
	  </tr>
	  <%} %>
	</table>
	</div>
	</div>
</body>
</html>