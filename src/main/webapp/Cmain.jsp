<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="css/index.css"/>
	<meta charset="UTF-8">
	<title>CusMain</title>
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
	<div class = "indexBody">
		<a href = ""><button type = "button" id = "FuelStatus"> <img src="./images/Fuel.png" width="200" height="100"/></button></a>
		<a href = "readAllRequest_servlet"><button type = "button" id= "Services"> Services </button></a>
		<a href = ""><button type = "button" id= "Payment"> payments </button></a>
	</div>
</body>
</html>