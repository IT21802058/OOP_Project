<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/header.css"/>
<link rel="stylesheet" href="css/index.css"/>
<link rel="stylesheet" href=payment.css>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta charset="ISO-8859-1">
<title>payment</title>
</head>
<body>
    <div class ="nav">
	<header>
		<ul>
			<li><a href="index.jsp"> Home </a></li>
			<li><a href=""> About </a></li>
			<li><a href=""> Contact us </a></li>
		</ul>
	</header>
	</div>
	
  <div class="row">
    <div class="column">
  
  <form action="paymentServlet" method="post">
       <fieldset>
          <legend>Personal details</legend>
            <label for="nic"><i class="fa fa-user"></i> NIC</label><br>
            <input type="text" id="nic" name="NIC" placeholder="200054801193"><br>
            <label for="fname"><i class="fa fa-user"></i> Full Name</label><br>
            <input type="text" id="fname" name="firstname" placeholder="kamal M. Doe"><br>
            <label for="email"><i class="fa fa-envelope"></i> Email</label><br>
            <input type="text" id="email" name="email" placeholder="kamal@example.com"><br>
            <label for="adr"><i class="fa fa-address-card-o"></i> Address</label><br>
            <input type="text" id="adr" name="address" placeholder="542 W. 15th Street"><br>
            <label for="city"><i class="fa fa-institution"></i> City</label><br>
            <input type="text" id="city" name="city" placeholder="Colombo"><br>
            <label for="state">State</label><br>
            <input type="text" id="state" name="state" placeholder="NY"><br>
            <label for="zip">Select your Zip</label><br>
            <input type="file" id="zip" name="zip" multiple><br><br><br>
       
        </div>
    </fieldset>
          
        <div class="column">
            <fieldset>
            <legend>Payment details</legend>
            <label for="fname">Accepted Cards</label>
            <div class="icon-container">
              <i class="fa fa-cc-visa" style="color:navy;"></i>
              <i class="fa fa-cc-amex" style="color:blue;"></i>
              <i class="fa fa-cc-mastercard" style="color:red;"></i>
              <i class="fa fa-cc-discover" style="color:orange;"></i>
            </div>
            
            <label for="bname">Bank Name</label><br>
            <input type="text" id="bname" name="bankname" placeholder="Bank of Ceylon"><br>
            <label for="cname">Name of the Card holder</label><br>
            <input type="text" id="cname" name="cardname" placeholder="W.M.L.L.Fernando"><br>
            <label for="ccnum">Credit card number</label><br>
            <input type="text" id="ccnum" name="cardnumber" placeholder="1111-2222-3333-4444"><br>
            <label for="expmonth">Exp Month</label><br>
            <input type="text" id="expmonth" name="expmonth" placeholder="September"><br>
            <label for="expyear">Exp Year</label><br>
            <input type="text" id="expyear" name="expyear" placeholder="2018"><br>
            <label for="cvv">CVV</label><br>
            <input type="text" id="cvv" name="cvv" placeholder="352"><br>
            
            <label>
            <input type="checkbox" checked="checked" name="sameadr"> <br>
            </label>
            <input type="submit" value="Add your bank details" class="btn"><br><br>
        </form>
             </div>
           </div>
        </fieldset><br><br><br><br><br><br>

        <div class="new">
        <p>You can your card details updated</p>
        <button onclick="document.location='uppayment.html'">UPDATE</button>
        <p>You can your card details deleted</p>
        <button onclick="document.location='deletepayment.html'">DELETE</button>
    </div>
</body>
</html>