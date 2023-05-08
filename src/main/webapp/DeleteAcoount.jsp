<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>

	<link rel="stylesheet" href="css/index.css"/>
	<meta charset="UTF-8">
	
	<title>Delete My Account</title>
	
	<style>
		
	body{
		background-image: url("images/ServiceCenter2.jpg") !important;
		background-repeat:no-repeat !important;
		background-size:cover !important;
	}
	
	.div1{
	  margin: auto;
	  padding: 20px; 
	  width : 35%;
	  padding: 10px;
	  border: 2px solid white;
	  border-radius: 20px;
	  background-color: #daeaf5;    
	  text-align :left;
	}
	
	.btnSub{
	  background-color: #e31f1b; 
	  color: white;  
	  padding: 10px 15px;  
	  margin: 5px 0;  
	  border: none;  
	  cursor: pointer;  
	  width: 100px;  
	  opacity: 0.9;
	  text-align: center;  
	  border-radius: 6px; 
	}
	
	.btnSub:hover {  
  		opacity: 20;  
	} 
	
	::placeholder { /* Chrome, Firefox, Opera, Safari 10.1+ */
  	 color: #2d2d2e;
 	 opacity: 1; /* Firefox */
	}
	
	</style>
	
</head>

<body>

	<%@ include file = "jsp/header.jsp" %>
	
	<div class ="nav">
	<header>
		<ul>
			<li><a href="index.jsp"> Home </a></li>
			<li><a href=""> About </a></li>
			<li><a href=""> Contact us </a></li>
			<li><a href="DisplayCustomerServlet"> My Profile </a></li>
		</ul>
	</header>
	</div>
	
	<br><br><br>
	
	<div class="div1">
	<h3 style="text-align:center" >Delete My Profile</h3>
	
	<p>Can you please share with us what was not working ? 
We are fixing bugs as soon as we spot them. 
If something slipped through our fingers, we'd be so grateful to be aware of and fix it.
Please inform it through our email "<b>NODKVehService@gmail.com</b>"</p><br>
	
	
	<p><b>OR</b></p><br>
	<p>Are you sure you want to delete the account ?</p><br><br>
	
	<form action="DltAccServlet" method= "POST">
	 
	 <label for="nic"> to confirm it's you, <b>Please enter your NIC number</b></label><br><br>
	 <input type="text" id="nic" name="nic" placeholder="200149786240" size ="50" required maxlength="12" ><br><br>
	 	 
	  <div class="div2" align="center">
	 	<input type="submit" class="btnSub" id="btnSub" name="submit" value= "Delete">
	 </div>
	 
	 </form>
	 </div>
	
	<%@ include file = "jsp/footer.jsp" %>
</body>
</html>