<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>

	<link rel="stylesheet" href="css/index.css"/>
	<meta charset="UTF-8">
	
	<title>My Profile</title>
	
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
	
	<div class="div1">
	 <h3 style="text-align:center" >My Profile</h3>
	  
	 <br><br>
	 <label for="nic"><b>NIC &nbsp;&nbsp;&nbsp;:</b></label>
	 <input type="text" id="nic" name="nic" placeholder="200149786240" size ="50" required maxlength="12" ><br><br>
	 
	 <label for="name"><b>Name :</b></label>
	 <input type="text" id="name" name="name" placeholder="Name" size ="50" ><br><br>
	 
	 <label for="phone"><b>Phone :</b></label>
	 <input type="text" id="phone" name="phone" placeholder="0123795846" size ="50" required maxlength="10"><br><br>
	 
	 <label for="email"><b>Email :</b></label>
	 <input type="text" id="email" name="email" placeholder="abc123@gmail.com" pattern="[a-zA-Z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" size ="50" required><br><br>
	 
	 <label for="city"><b>City :</b></label>
	 <input type="text" id="city" name="city" placeholder="City" size ="52" required><br><br>
	 
	 <label for="userName"><b>UserName :</b></label>
	 <input type="text" id="userName" name="userName" placeholder="Username" size ="45" required><br><br>
	 
	 <label for="password"><b>Password :</b></label>
	 <input type="password" id="password" name="password" placeholder="aB12#sTE" size ="46" required><br><br>
	 
	 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	 <input type="checkbox" onclick="pwdConFunction()"> &nbsp;&nbsp;&nbsp;Show Password<br><br>
	 
	  <div class="div2" align="center">
	 	<input type="submit" class="btnSub" id="btnSub" name="btnSub" value= "Edit Profile">
	 </div>
	 
	 
	</div>	  
	
	<%@ include file = "jsp/footer.jsp" %>
</body>
</html>