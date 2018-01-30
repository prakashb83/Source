<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
</head>
<body>
	<form action="mainservlet" method="post">
		Enter your name:<input type="text" name="name" autocomplete="off" required><br><br>
		Enter your last name:<input type="text" name="lname" autocomplete="off" required><br><br>
		Enter your mobile number:<input type="text" name="mname" autocomplete="off" required><br><br>
		Enter your Age:<input type="text" name="aname" autocomplete="off" required><br><br>
		Enter your Gender:<input type="text" name="gname" autocomplete="off" required><br><br>
		Enter your Email address:<input type="text" name="ename" autocomplete="off" required><br><br>
		Enter your Blood Group:<input type="text" name="bgname" autocomplete="off" required><br><br>
		Enter your address:<textarea name="adname" autocomplete="off" required></textarea><br><br>
		<input type="submit" value="submit">
	</form>
</body>
</html>