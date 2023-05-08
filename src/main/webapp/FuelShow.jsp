<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="css/FuelShow.css">
	
	<meta charset="UTF-8">
    <title>FuelShow</title>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
   
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
    <h1>Fuel Storages</h1>
    <a href="FuelM.jsp"><button class="button edit">Edit</button></a>
    
    <div class="chart-container">
        <canvas id="myChart"></canvas>
    </div>
    <div class="make">
    <a href="Order.jsp"><button class="button button1">Make Order</button></a>
    </div>
    
    
    <div class="history">
    <a href="ShowOrder.jsp"><button class="button button1">Order History</button></a>
    </div>
    <script src="jsp/FuelShow.js"></script>
    
    </div>
    
	
	<%@ include file = "jsp/footer.jsp" %>
	
</body>
</html>
