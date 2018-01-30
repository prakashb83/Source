<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.8/angular.min.js"></script>
	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body ng-controller="mainCtrl" class="container" ng-app="app">
<form>
<div class="w3-container w3-black">
<div class="row" style="background:black">
<div class="col-sm-2">
Info
</div>
<div class="col-sm-2">
Site Map
</div>
<div class="col-sm-3">
<b>Services</b>
</div>
<div class="col-sm-3">
Contact Us
</div>
<div class="col-sm-2">
 <div class="col-sm-1">Welcome   
<div class="col-sm-1">
     <span class="glyphicon glyphicon-log-out"></span>
</div>
    </div></div>
</div></div>


<div class="row" style="background-color: cornsilk">
<a href="/logindetails/home.jsp" style="text-decoration: none; font-size:24px">Go back</a>
<!--  <div class="col-sm-3">
<div class="vertical-menu">
  <a href="#">Home</a>
  <a href="#">Menu 1</a>
  <a href="#">Menu 2</a>
  <a href="#">Menu 3</a>
  <a href="#">Menu 4</a>
</div></div>-->


<div class="col-sm-9" style="padding-top:30px">
<b><p>Personal Details</p></b>
Enter  Name: <input type="text" name="name" ng-model="users.name" placeholder="name"
style="margin-bottom: 20px;"/><br>
Enter email: <input type="text" name="email" ng-model="users.email" placeholder="Email" 
style="margin-bottom: 20px;"/><br>
contact No: <input type="text" name="phoneNo" ng-model="users.phoneNo" placeholder="phone Number" 
style="margin-bottom: 20px;"/><br>

<b><p>Bank Details</p></b>
 Select bank: <select ng-model="users.edd" ng-options="x for x in bank" 
 style="margin-bottom: 20px;">
 <option value="">-- Choose Bank</option>
   </select><br>
   Card No: <input type="text" name="card" ng-model="users.card" placeholder="card" 
style="margin-bottom: 20px;"/><br>
      
 <!--   <label for ="avail">Available:</label>
<!-- <select multiple="true" ng-model="selected" ng-options="item for item in selectedItems" style="width: 200px">
</select>
<label for ="selected">Selected:</label>
<select  multiple="true" ng-model="available" ng-options="item for item in availableItems" style="width: 200px">
</select>
    <br />
<!--<button ng-click="moveItem(selected[0], selectedItems, availableItems)"> > </button>
<button ng-click="moveAll(selectedItems, availableItems)"> >> </button>
  Choose hobby: <select size="4" name="hobby" ng-model="users.hobby">
  <option value="music">music</option>
  <option value="dance">dance</option>
  <option value="reading books">reading books</option>
  <option value="gardening">gardening</option>
  </select>
  <button id=">"> > </button>
  <br>-->
<button ng-click="addItem(users)">Add</button>
<table width="50%">

  <tr ng-repeat="us in userInfo">
    <td>{{us.name}}</td>
	<td>{{us.email}}</td>
	<td>{{us.phoneNo}}</td>
	<td>{{us.edd}}</td>
	<td>{{us.card}}</td>
	
	<td><span class="fa fa-close" ng-click="delItem($index)"></span></td>
	</tr>
</form>
</div>
<script>
angular.module('app', []);

angular.module('app').controller('mainCtrl', function($scope) {
    $scope.userInfo = [];
    $scope.bank = ["HDFC", "SBI", "Indian Bank"];
    $scope.addItem = function(data) {
        $scope.userInfo.push(data);
        $scope.users = '';
    }
	$scope.delItem=function(index){
	$scope.userInfo.splice(index,1);
	}
	$scope.moveItem = function(item, from, to) {
        var idx=from.indexOf(item);
        if (idx != -1) {
            //from.splice(idx, 1);
            to.push(item);      
        }
    };
    $scope.moveAll = function(from, to) {
        angular.forEach(from, function(item) {
            to.push(item);
        });
       // from.length = 0;
    };
    
  //$scope.selectedItems = ['a','b','c'];
    //$scope.availableItems = [];

	//$scope.addList=function(val){
	
});
</script>
</table>
</body>
</html>
</body>
</html>