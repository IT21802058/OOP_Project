<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="com.oop.model.Customer" %>
    <%@ page import="com.oop.model.User" %>
    <%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html>

<html>

<head>

	<link rel="stylesheet" href="css/index.css"/>
	<meta charset="UTF-8">
	<script src="Script/Login.js"></script>
	<title>My Profile</title>
	
	<style>
		
	body{
		background-image: url("images/ServiceCenter1.jpg") !important;
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
	  background-color: #6bab50; 
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
	<% Customer cust = new Customer();
		cust = (Customer)request.getAttribute("cusDetails"); %>
		
	<form style ="justify-content:center">
	<div class="div1">
	 <h3 style="text-align:center" >My Profile</h3>
	  
	 <br><br>
	 <label for="nic"><b>NIC &nbsp;&nbsp;&nbsp;:</b></label>
	 <input type="text" id="nic" name="nic" placeholder="<%=cust.getNIC() %> " size ="50"  maxlength="12" readonly><br><br><br>
	 <label for="name"><b>Name :</b></label>
	 <input type="text" id="name" name="name" placeholder="<%=cust.getName() %>" size ="50" readonly><br><br><br>
	 
	 <label for="phone"><b>Phone :</b></label>
	 <input type="text" id="phone" name="phone" placeholder="<%=cust.getPhone() %>" size ="50"   readonly><br><br><br>
	 
	 <label for="email"><b>Email :</b></label>
	 <input type="text" id="email" name="email" placeholder="<%=cust.getEmail() %>"  size ="50" readonly><br><br><br>
	 
	 <label for="city"><b>City :</b></label>
	 <input type="text" id="city" name="city" placeholder="<%=cust.getCity() %>" size ="52" required readonly><br><br><br>
	 
	 <label for="userName"><b>UserName :</b></label>
	 <input type="text" id="userName" name="userName" placeholder="<%=cust.getUsername() %>" size ="45" required readonly><br><br><br>
	 
	 <label for="password"><b>Password :</b></label>
	 <input type="password" id="pwd" name="password" placeholder="<%=cust.getPassword() %>" size ="46" required readonly><br><br><br><br>
	 
	 <!-- &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	 <input type="checkbox" onclick="pwdFunction()"> &nbsp;&nbsp;&nbsp;Show Password<br><br> -->
	 
	 
	  <div class="div2" align="center">
	  <button><a href="Cmain.jsp" data-role="button" data-inline="true">Go Back</a></button>
	  <button><a href="UpdVeiwExistingCusServlet" data-role="button" data-inline="true" data-theme="b"> Update Details</a></button>
	  <button><a href="DeleteAcoount.jsp" data-role="button" data-inline="true" data-theme="c"> Delete Account</a></button>
	 </div><br><br><br>
	 
	 </div>
	 </form><br><br>
		  
	
	<%@ include file = "jsp/footer.jsp" %>
</body>
</html>