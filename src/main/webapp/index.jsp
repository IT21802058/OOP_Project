<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="css/index.css"/>
	<meta charset="UTF-8">
	<title>Fuel/service</title>
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
	
	<div class = "indexBody">
		<a href = "Login.jsp"><button type = "button" id = "LogIn"> LogIn</button></a>
		<a href = ""><button type = "button" id= "SignUP"> Sign up </button></a>
	</div>
	
	<%@ include file = "jsp/footer.jsp" %>
</body>
</html>