<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="css/Login.css"/>
	<link rel="stylesheet" href="css/index.css"/>
	<script src="Script/Login.js"></script>
	<meta charset="UTF-8">
	<title>Login</title>
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
	
	<div class="login_container"> 
			<form method="post" class="loginform" action="loginServlet" id="login">
					<h1 class="form_title">Login</h1>
					<br>
				<div class="form_input_group">
					<input type="text" class="form_input" name="Lemail" autofocus placeholder="example@example.example" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$">
				</div>
				<br>
				<div class="form_input_group">
					<input type="password" id ="pwd" class="form_input" name="Lpwd" autofocus placeholder="Password">
				</div>
				<br>
					<input type="checkbox" onclick="pwdFunction()">Show Password<br>
				<br>
					<button class="form_login_btn" type="submit" name="logInBtn">Login</button>
					<br>
					<br>
				<p class="form_text">
					<a href="" class="form_link"> Forgot your password?</a>
				</p>
				<p class="form_text">
					<a href="Registration.jsp" class="form_link" id ="linkCreatAccount"> Don't have a account? create account</a>
				</p>
				<p class="form_text">
					<a href="DeleteAcoount.jsp" class="form_link" id ="dltAccount"> Want to delete account?</a>
				</p>
			</form>
		</div>	
		<%@ include file = "jsp/footer.jsp" %>
</body>
</html>