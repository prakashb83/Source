<%@page import="com.room.sample.view.aaa"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myapp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
 <style>
    	#header
        {
        width: 100%;
        height: 600px;
        background-color: wheat; 
        }
        #content
        {
        width: 200px;
        height: auto;
        background-color: none;
        position: relative;
        left: 550px;
        top: 50px;

        }
    </style>
</head>
<body>
	<%
	String customer=(String)session.getAttribute("cust");
	String customer1=(String)session.getAttribute("bbb");
	//System.out.println(customer1);
	String cust1mod = customer1.substring(customer1.length()-1, customer1.length());
	String custmod = customer.substring(customer.length()-1, customer.length());
	String finalmod = custmod.concat(cust1mod);
	%>
	<body ng-controller="controller">
	<div id="header">
    	<div id="content">
	<form id="myform" method="post">
       		Name:<input type="text" id="tt1" ng-model="name" title="Please enter your name" autocomplete="off"><br><br>
            Age:<input type="number" id="tt2" ng-model="age" title="Please enter your age" autocomplete="off"><br><br>
            Gender:<input type="text" id="tt3" ng-model="gender" title="Please enter your gender" autocomplete="off"><br><br>
            <input type="submit" value="SUBMIT" ng-click="submit()" style = "cursor:pointer"><br><br>
	</form>
        </div>
        <br>
        <br>
        <br>
        <table id="mytable" align="center" border="1" style="width:400px">
            <tr>
            	<th>Name</th>
                <th>Age</th>
             	<th>Gender</th>
		<th>Update</th>
		<th>Delete</th>
             </tr>
             <tr ng-repeat="s in records">
			
            	<td align="center">{{s.Name}}</td>
                <td align="center">{{s.Age}}</td>
                <td align="center">{{s.Gender}}</td>
		<td align="center"><input type="button" value="save" ng-click="save()" style = "cursor:pointer"></td>
		<td align="center"><input type="button" value="delete" ng-click="delete()" style = "cursor:pointer"></td>
            </tr>
        </table>
{{message}}
{{mess}}
        </div>
        <script>
        var app = angular.module('myapp',[]);
        app.controller('controller',function($scope) {
        $scope.submit = function() {
         $scope.records = [
   			{
  				 "Name":document.getElementById("tt1").value,
   					"Age":document.getElementById("tt2").value,
  				 "Gender":document.getElementById("tt3").value
  			 }    
  		]
	//delete or reset funtion
        }
	$scope.delete = function() {
	if(document.getElementById('tt1').value == "" && document.getElementById('tt2').value == "" && document.getElementById('tt3').value == "")
	{
	alert('Enter the details to delete the data');
	}
	else
	{
		document.getElementById("myform").reset();
		document.getElementById("mytable").deleteRow(1);
	}
	}
	//save function
	 $scope.save = function() {
		if(document.getElementById('tt1').value == "" && document.getElementById('tt2').value == "" && document.getElementById('tt3').value == "")
			{
			alert('Enter the details to save the data');
			}
		else
			{
				alert('saved');
				document.getElementById("myform").reset();
				document.getElementById("mytable").deleteRow(1);
				window.open('success.jsp');
			}
	
	}
        });
        </script>
</body>

</body>
</html>