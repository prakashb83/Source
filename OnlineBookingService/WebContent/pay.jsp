<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><center>ONLINE PAYMENTS</center></h1>

<fieldset>
<legend>Payment mode</legend>
  <input type="radio" name="card" value="DC">Debit Card
  <input type="radio" name="card" value="CC">Credit Card
  <input type="radio" name="card" value="nb">Net Banking
</fieldset><br><br>
<fieldset>

	<legend>Payment Mode Details</legend>
	 <label><b>Username/Account Number</b></label>
    <input type="text" placeholder="Enter Username/Account Number" id="username" required>

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" id="password" required>
</fieldset>
<input type="submit" value="Pay Now" onclick="myFunction()"  ><INPUT TYPE="hidden" NAME="redirect" VALUE="index.html"></input>


    <script   type="text/javascript">
      function myFunction() {
       // document.getElementById("myForm").reset();
        alert("Your Payment is Done Successfully");
        window.location.assign("index.html");
      }
	</script>

</body>
</html>