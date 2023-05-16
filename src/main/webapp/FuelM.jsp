<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <script src="jsp/FuelM.js"></script>
	<link rel="stylesheet" href="css/FuelM.css"/>
	<meta charset="UTF-8">
	<title>Edit Fuel Status</title>
	<link rel="stylesheet" href="css/index.css">
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
</head>
<body>
	<%@ include file = "jsp/header.jsp" %>
	<div class ="nav">
	<header>
		<ul>
			<li><a href="index.jsp"> Home </a></li>
			<li><a href=""> About </a></li>
			<li><a href=""> Contact </a></li>
			<li><a href="Amain.jsp">Dashboard</a></li>
		</ul>
	</header>
	</div>

<body>
    <h1>Gas Storage Management System</h1>
    <div class="square">
    <div class="container">
      <form method="POST" action="UpdateStorageaddservlet">
      <br><br><br><br><br>
	      <label for="product">Fuel Type:</label>
	      <select id="product" name="fType">
	      <option value="Petrol">Petrol</option>
	      <option value="octane95">Octane95 Petrol</option>
	      <option value="Diesel">Diesel</option>
	      <option value="SuperDiesel">Super Diesel</option>
		  </select><br><br>
		  <label for="addfuel">Amount :</label>
	      <input type="number" id="addfuel" name="addfuel">
	      <br>
	      <br>
	      <button type="submit" class="button b">Update</button>
	      
        </form>
        
        
    </div>
    </div>
</body>
</html>