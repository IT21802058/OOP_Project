<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.oop.service.RequestService_service" %>
<%@ page import = "com.oop.service.RequestService_interface" %>

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
	
	<%
		String serveNo = request.getParameter("id");
	%>
	
	<form method="post" class="edit_form" action="EditRequest_servlet">
			<div class="container1">
				<h1 class="l"><b>Update service</b></h1>
					<div class="a">
						<input type="hidden" name = "ID" value = "<%=serveNo %>">
						<br>
						<br>
						<b>Vehicle Letters  : </b>
						<br>
						<%
							RequestService_interface RSI = new RequestService_service();
							String VLettrs = RSI.getVLettrs(serveNo);
						%>
						<br>
						<b style="color:red"><%=VLettrs %></b> 
						<br>
						<br>
						<br>
						<b>Vehicle Number  : </b>
						<br>
						<%
							String Vnum = RSI.getNumber(serveNo);
						%>
						<br>
						<br>
						<b style="color:red"><%=Vnum %></b>  
						<br>
						<br>
						<br>
							<div class="form_group">
						
								<label ><b>Service Type : </b></label>
							<div><br>
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
							<br>
							<input type="submit" class="servicebutn" value="Update" name="btnEdit"/>
							</div>	 
					</div>
			</div>
	</form>
	<%@ include file = "jsp/footer.jsp" %>
</body>
</html>