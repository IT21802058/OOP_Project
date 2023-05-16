
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="css/index.css"/>
	<meta charset="UTF-8">
	<title>AdmMain</title>
	
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
	</div >
	<h1>Admin DashBoard</h1>
	<table class="table">

				<tr style="height:500px">
					<td style="width:350px">
					<a href="ViewFuelStatusAdmin_servlet">
					<button><div class="button1"><br>
					<img src="images\FeulStatus.jpeg" height="160px" width="160px"><br/>
					<p><b>View Fuel Status</b></p>
					</div></button></a>
					</td>
					
	</table>
</body>
</html>