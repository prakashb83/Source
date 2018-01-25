.<%@page import="com.librarymanagement.servlet.MainServlet"%>
<%@page import="com.librarymanagement.bean.LibraryBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
<link href='http://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="css/cust_css/style.css">
<link rel="stylesheet" type="text/css" href="style.css" media="all" />
</head>
<style>
.center {
    text-align: center;
    margin: auto;
    width: 60%;
    border: 3px solid #73AD21;
    padding: 10px;
}

.button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 20%;
}

</style>
<body>
<section>
<%
   LibraryBean libraryBean=(LibraryBean)request.getAttribute("libraryBean");
%>
<h1><%="Topic: "+libraryBean.getTopic()%></h1>
</div>
<div class="center">
<br>
<br>
<table border="1" width="100%" >
<col width="100">
  <col width="200">
    <tr>
        <td><font size="4" color="red"> Book </td>
        <td><font size="4" color="blue"><%=libraryBean.getBook1()%></td>
    </tr>
    <tr>
        <td><font size="4" color="red">Author </td>
        <td><font size="4" color="blue"><%=libraryBean.getAuthor1() %></td>
    </tr>
    <tr>
        <td><font size="4" color="red">Call Number</td>
        <td><font size="4" color="blue"><%=libraryBean.getPlace1() %></td>
    </tr>
</table><br>
<table border="1" width="100%">
<col width="100">
  <col width="200">
    <tr>
        <td><font size="4" color="red">Book </td>
        <td><font size="4" color="blue"><%=libraryBean.getBook2()%></td>
    </tr>
    <tr>
        <td><font size="4" color="red">Author </td>
        <td><font size="4" color="blue"><%=libraryBean.getAuthor2() %></td>
    </tr>
    <tr>
        <td><font size="4" color="red">Call Number </td>
        <td><font size="4" color="blue"><%=libraryBean.getPlace2() %></td>
    </tr>
</table><br>
<table border="1" width="100%">
<col width="100">
  <col width="200">
    <tr>
        <td><font size="4" color="red">Book </td>
        <td><font size="4" color="blue"><%=libraryBean.getBook3()%></td>
    </tr>
    <tr>
        <td><font size="4" color="red">Author </td>
        <td><font size="4" color="blue"><%=libraryBean.getAuthor3() %></td>
    </tr>
    <tr>
        <td><font size="4" color="red">Call Number </td>
        <td><font size="4" color="blue"><%=libraryBean.getPlace3() %></td>
    </tr>
</table><br>
<table border="1" width="100%">
<col width="100">
  <col width="200">
    <tr>
        <td><font size="4" color="red">Book </td>
        <td><font size="4" color="blue"><%=libraryBean.getBook4()%></td>
    </tr>
    <tr>
        <td><font size="4" color="red">Author </td>
        <td><font size="4" color="blue"><%=libraryBean.getAuthor4() %></td>
    </tr>
    <tr>
        <td><font size="4" color="red">Call Number </td>
        <td><font size="4" color="blue"><%=libraryBean.getPlace4() %></td>
    </tr>
</table><br>
<table border="1" width="100%">
<col width="100">
  <col width="200">
    <tr>
        <td><font size="4" color="red">Book </td>
        <td><font size="4" color="blue"><%=libraryBean.getBook5()%></td>
    </tr>
    <tr>
        <td><font size="4" color="red">Author </td>
        <td><font size="4" color="blue"><%=libraryBean.getAuthor5() %></td>
    </tr>
    <tr>
        <td><font size="4" color="red">Call Number </td>
        <td><font size="4" color="blue"><%=libraryBean.getPlace5() %></td>
    </tr>
</table><br>
<h2><a class="button" href="/Library_Management/index.jsp">Finish</a></h2>
</div>
</section>
</body>
</html>
