<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>

	<link rel="stylesheet" href="css/index.css"/>
	<meta charset="UTF-8">
	
	<title>Delete My Account</title>
	
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
	
	<p>Are you sure you want to delete the account ?</p><br><br>
	
	<div class="div1">
	<form action="DltAccServlet" method= "POST">
	 
	 <label for="nic"><b>enter your NIC number</b></label><br><br>
	 <input type="text" id="nic" name="nic" placeholder="200149786240" size ="50" required maxlength="12" ><br><br>
	 	 
	  <div class="div2" align="center">
	 	<input type="submit" class="btnSub" id="btnSub" name="submit" value= "Delete">
	 </div>
	 
	 </form>
	 </div>
	
	<%@ include file = "jsp/footer.jsp" %>
</body>
</html>