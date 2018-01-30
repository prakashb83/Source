<!DOCTYPE html>
<html lang="en">
<head>
  <title>Login Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular-route.js"></script>
</head>
<body>
<%
session.setAttribute("invalid","valid");
%>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Suren</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="#"><i class="glyphicon glyphicon-home"></i>&nbsp;Home</a></li>
      <li><a href="#"><i class="glyphicon glyphicon-briefcase"></i>&nbsp;About</a></li>
      <li><a href="#"><i class="glyphicon glyphicon-earphone"></i>&nbsp;Contact</a></li>
    </ul>
     <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><i class="glyphicon glyphicon-user"></i>&nbsp;Login</a></li>
      <li><a href="#"><i class="glyphicon glyphicon-lock"></i>&nbsp;Register</a></li>
    </ul>
  </div>
</nav>
  
<div class="container">
<div class="col-md-12 text-center">
 <form action = "servlet" class="form-group">
 	<label>Name:</label>
 	<input type="text" name="username" autocomplete="off" required><br><br>
 	<label>Email:</label>
 	<input type="text" name="emailid" autocomplete="off" required><br><br>
 	<label>Bdate:</label>
 	<input type="text" name="bdate" autocomplete="off" required><br><br>
 	<input type="submit" class="btn btn-success">
 </form>
 
 </div>
 <%
 try
 {
	 String page1 = (String)session.getAttribute("invalid");
	 System.out.println("Page1 is "+page1);
	 if(page1.equals("invalid"))
	 { 
		 System.out.println("invalid");
		 %>
		 <script type="text/javascript">
		 	alert("Invalid Username or password");
		 </script> <%
	 }
 }
 catch(Exception e)
 {
	 e.printStackTrace();
 }
 %>
</div>

</body>
</html>
