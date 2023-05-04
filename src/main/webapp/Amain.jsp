
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="css/index.css"/>
	<meta charset="UTF-8">
	<title>AdmMain</title>
	
	<style>
		.button1{
		font-size:15px;
		width: 220px;
		height: 220px;
		color: black;
		cursor: pointer;
		}
		
		
		button{
		background-color:  #fff;
		border-radius: 15px;
		}
		
		button:hover{
			background-color : #d9b680;
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
		</ul>
	</header>
	</div >
	<table align="center">
					
				<tr style="height:500px">
					<td style="width:350px">
					<a href="FuelShow.jsp">
					<button><div class="button1"><br>
					<img src="images\FeulStatus.jpeg" height="160px" width="160px"><br/>
					<p><b>View Fuel Satus</b></p>
					</div></button></a>
					</td>
					
				
				</table>
</body>
</html>