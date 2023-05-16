<%@page import="com.oop.model.Fuel"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="css/FuelShow.css">
	
	<meta charset="UTF-8">
    <title>FuelShow</title>
    <script src="https://cdn.jsdelivr.net/npm/chart.js" ></script>
   
</head>
<body>
	<%@ include file = "jsp/header.jsp" %>
	
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
    <% ArrayList<Fuel> fuel = (ArrayList<Fuel>)request.getAttribute("FuelInfo"); 
    	Fuel fl = fuel.get(2);
    	int petrol = fl.getLiter();
    	
    	fl = fuel.get(1);
    	int octane95 = fl.getLiter();
    	
    	fl = fuel.get(0);
    	int diesel = fl.getLiter();
    	
    	fl = fuel.get(3);
    	int superdiesel = fl.getLiter();
    %>
    <script >
    
    const data = { 
    	    labels: ['Petrol', 'Octane95 Petrol ', 'Diesel', 'Super Diesel'],
    	    datasets: [{
    			
    			int:petrol=<%=petrol%>,
    			int:octane95=<%=octane95%>,
    			int:diesel=<%=diesel%>,
    			int:superdiesel=<%=superdiesel%>,
    	        label: '#Storage Amount',
    	        data: [petrol, octane95, diesel, superdiesel],
    	        backgroundColor: [
    	            'rgba(255, 99, 132, 0.2)',
    	            'rgba(54, 162, 235, 0.2)',
    	            'rgba(255, 206, 86, 0.2)',
    	            'rgba(75, 192, 192, 0.2)',
    	            'rgba(153, 102, 255, 0.2)'
    	        ],
    	        borderColor: [
    	            'rgba(255, 99, 132, 1)',
    	            'rgba(54, 162, 235, 1)',
    	            'rgba(255, 206, 86, 1)',
    	            'rgba(75, 192, 192, 1)',
    	            'rgba(153, 102, 255, 1)'
    	        ],
    	        borderWidth: 1
    	    }]
    	};

    	const options = {
    	    scales: {
    	        y: {
    	            beginAtZero: true
    	        }
    	    }
    	};

    	const ctx = document.getElementById('myChart').getContext('2d');
    	const myChart = new Chart(ctx, {
    	    type: 'bar',
    	    data: data,
    	    options: options
    	});
    </script>
    
    </div>
    
	
	<%@ include file = "jsp/footer.jsp" %>
	
</body>
</html>
