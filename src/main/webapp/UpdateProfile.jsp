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
	
	<style>
		
	body{
		background-image: url("images/ServiceCenter.jpg") !important;
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
	
	<title>Update Profile Details</title>
	
</head>



<body>

	<%@ include file = "jsp/header.jsp" %>
	
	<div class ="nav">
	<header>
		
		<ul>
			<li><a href="index.jsp"> Home </a></li>
			<li><a href=""> About </a></li>
			<li><a href=""> Contact us </a></li>
			<li><a href=DisplayCustomerServlet> My Profile </a></li>
			
		</ul>
		
	</header>
	</div><br><br><br>
	
	
	<% Customer cust = new Customer();
		cust = (Customer)request.getAttribute("cusDetails"); %>
		
	<form action="UpdateCustomerServlet" method= "POST">
	<div class="div1">
	 <h3 style="text-align:center" >Edit My Profile</h3>
	  
	 <br><br>
	 <label for="nic"><b>NIC &nbsp;&nbsp;&nbsp;:</b></label>
	 <input type="text" id="nic" name="nic" placeholder="<%=cust.getNIC() %> " size ="50"  maxlength="12" readonly><br><br><br>
	 
	 <label for="name"><b>Name :</b></label>
	 <input type="text" id="name" name="name" value="<%=cust.getName() %>" size ="50" ><br><br><br>
	 
	 <label for="phone"><b>Phone :</b></label>
	 <input type="text" id="phone" name="phone" value="<%=cust.getPhone() %>" size ="50" maxlength="10"  ><br><br><br>
	 
	 <label for="email"><b>Email :</b></label>
	 <input type="text" id="email" name="email" value="<%=cust.getEmail() %>" pattern="[a-zA-Z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" size ="50" ><br><br><br>
	 
	 <label for="city"><b>City :</b></label>
	 <input type="text" id="city" name="city" value="<%=cust.getCity() %>" size ="52"  ><br><br><br>
	 
	 <label for="userName"><b>UserName :</b></label>
	 <input type="text" id="userName" name="userName" value="<%=cust.getUsername() %>" size ="45"  ><br><br><br>
	 
	 <label for="password"><b>Password :</b></label>
	 <input type="password" id="pwd" name="password" value="<%=cust.getPassword() %>" size ="46" ><br><br><br>
	 
	 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	 <input type="checkbox" onclick="pwdFunction()"> &nbsp;&nbsp;&nbsp;Show Password<br><br>
	 
	  <div class="div2" align="center">
	 	<input type="submit" class="btnSub" id="btnSub" name="btnSub" value= "update Profile">
	 </div><br><br><br>
	 
	 </div>
	 </form>
		  
	
	<%@ include file = "jsp/footer.jsp" %>
</body>
</html>