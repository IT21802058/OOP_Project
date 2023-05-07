<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Order</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String product = request.getParameter("product");
		String size = request.getParameter("size");
		String qty = request.getParameter("qty");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
	%>
	<h1>Order Delete</h1>
	<form action="DeleteOrderservlet" method="post">
		<table>
			<tr>
				<td>Order ID</td>
				<td><input type="text" name="id" value="<%= id %>" readonly></td>
			</tr>
			<tr>
				<td>Fuel Type</td>
				<td><input type="text" name="product" value="<%= product %>" readonly></td>
			</tr>
			<tr>
				<td>Bowser Size</td>
				<td><input type="text" name="size" value="<%= size %>" readonly></td>
			</tr>
			<tr>
				<td>Quantity</td>
				<td><input type="text" name="qty" value="<%= qty %>" readonly></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" value="<%= name %>" readonly></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" value="<%= email %>" readonly></td>
			</tr>
		</table>
		<br>
		<input type="submit" name="submit" value="Delete">
	</form>
</body>
</html>
