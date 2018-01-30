<%@ page import="bloodbank.setandget" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
</head>
<body ng-app="">
	<%
			setandget ss = (setandget)request.getAttribute("ssinfo");
	%>
	<%= "Welcome: "+ss.getName().toUpperCase()%><br>
	<%="Your data has been saved successfully"%><br>
	<%= "Your blood group is: "+ss.getBgname() %>
	
</body>
</html>