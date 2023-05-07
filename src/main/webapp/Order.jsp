<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
  <head>
    <title>Order Form</title>
    <link rel="stylesheet" href="css/order.css">
    
	
    <link rel="stylesheet" href="css/index.css"/>
	<meta charset="UTF-8">
  </head>
  <body>
  <%@ include file = "jsp/header.jsp" %>
  <div class ="nav">
	<header>
		<ul>
			<li><a href="index.jsp"> Home </a></li>
			<li><a href=""> About </a></li>
			<li><a href=""> Contact us </a></li>
		</ul>
	</header>
	</div>
	<div class="square">
    <h1>Order Form</h1>
    <form method="POST" action="Order">
      <label for="product">Fuel Type:</label>
      <select id="product" name="product">
        <option value="Petrol">Petrol</option>
        <option value="Octanne 95 Petrol">Octane95 Petrol</option>
        <option value="Diesel">Diesel</option>
        <option value="Super Diesel">Super Diesel</option>
      </select>
      
      <label for="name">Bowser size(L):</label>
      <select id="quantity" name="size">
        <option value="7500">7500</option>
        <option value="10000">10000</option>
        <option value="12500">12500</option>
      </select>
      
      <label for="quantity">Quantity (Bowsers):</label>
      <select id="quantity" name="qty">
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
      </select>
      <!--  <input type="text" id="quantity" name="quantity">-->
      
      <label for="name">Name:</label>
      <input type="text" id="name" name="name" required>
      
      <label for="email" >Email:</label>
      <input type="email" id="email" name="email" required>
      
      <button type="submit" >Submit Order</button>
    </form>
    </div>
  </body>
</html>
