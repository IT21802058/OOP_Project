<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="css/index.css"/>
	<link rel="stylesheet" href="css/Requestservice.css"/>
	<title>Request service</title>
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
	
	<form method="post" class="request_form" action="RequestServiceServlet">
			<div class="container1">
				<h1 class="l"><b>Request service</b></h1>
			<div class="a">
					<br>
					<br>
					<b>Vehicle Letters  : </b>
					<br>
						<input type="text" name="Vletters" id = "Vhletters" placeholder="ABC" size="3" required> 
					<br>
					<br>
					<br>
					<b>Vehicle Number  : </b>
					<br>
					<br>
						<input type="text" placeholder="6744" name="VNumber" required>  
					<br>
					<br>
					<br>
					
						<div class="form_group">
						
					<label ><b>Service Type : </b></label>
			<div>
			<br>
				<select name = "servicetype">
					<option value = 1> Full Service</option>
					<option value = 2> Car Wash</option>	
				</select>
			</div>
			<br>
			<br>
				<label><b>Service Date:</b></label>
  				<input type="date"  name="serviceday">
				<br>
				<br>
			<input type="submit" class="servicebutn" value="Request" name="btnSubmit"/>
	 </div>	 
	 </div>
	 </div>
	</form>
	<%@ include file = "jsp/footer.jsp" %>
</body>
</html>