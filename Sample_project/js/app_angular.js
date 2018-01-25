/* AngularJS Module */
var app = angular.module("myPortal", ["ngRoute"]);

/* Routing */
app.config(['$routeProvider', function($routeProvider){
  $routeProvider
  .when('/Server_deploy', {
	  templateUrl: 'Server_deploy.html'
  })
  .when('/app_jquery', {
	  templateUrl: 'app_jquery.html'
  })
  .when('/about', {
	templateUrl: 'About.html'
  })
  .when('/contact',{
	  templateUrl: 'Contacts.html'
  });
}]);

/* Controller */
app.controller('dataController', function($scope){
	
	$scope.build = [
		{Name: 'Windows', RAM: '32GB', HD: '512GB', url: 'Images/windows_server.png'},
		{Name: 'Linux', RAM: '32GB', HD: '1024GB', url: 'Images/Linux_server.png'},
		{Name: 'Tomcat', RAM: '16GB', HD: '1TB', url: 'Images/tomcat.png'},
		{Name: 'NginX', RAM: '32GB', HD: '1TB', url: 'Images/nginx.png'},
		{Name: 'Oracle', RAM: '16GB', HD: '1TB', url: 'Images/oracle.jpg'},
		{Name: 'Java', RAM: '32GB', HD: '512GB', url: 'Images/java.png'},
		{Name: 'IBM', RAM: '32GB', HD: '1024GB', url: 'Images/ibm.png'},
		{Name: 'Lite Speed', RAM: '16GB', HD: '1TB', url: 'Images/litespeed.png'},
	];
	
	$scope.pckage = [
		{Name: 'WAMP', Type: 'War', Repository: 'GitHub', url: 'Images/wamp.png'},
		{Name: 'Cherokee', Type: 'War', Repository: 'GitHub', url: 'Images/cherokee.png'},
		{Name: 'Tomcat', Type: 'War', Repository: 'GitHub', url: 'Images/apache_http.png'},
		{Name: 'NginX', Type: 'War', Repository: 'GitHub', url: 'Images/server4.png'},
		{Name: 'Oracle', Type: 'War', Repository: 'GitHub', url: 'Images/server5.png'},
		{Name: 'Java', Type: 'War', Repository: 'GitHub', url: 'Images/server6.png'},
		{Name: 'IBM', Type: 'War', Repository: 'GitHub', url: 'Images/server7.png'},
		{Name: 'IIS', Type: 'War', Repository: 'GitHub', url: 'Images/iis.png'},
	];

	$scope.onLoad = function(){
	  	$scope.isImageVisible = false;
		$scope.isDataVisible = false;
		$scope.isPckgButtonVisible = false;
		$scope.isDeployButtonVisible = true;
		$scope.isPckgVisible = false;
	}
	
	$scope.showData = function(){
		$scope.isDataVisible = true;
        $scope.isPckgVisible = false;		
	}
	
	$scope.showImageAndButton = function(){
		$scope.isImageVisible = true;
		$scope.isPckgButtonVisible = true;
	}
	
	$scope.showImage2AndButton = function(){
		$scope.isImageVisible = true;
		$scope.isPckgButtonVisible = true;
		$scope.isDeployButtonVisible = false;
	}
	
	$scope.showPackges = function(){
		$scope.isPckgVisible = true;	
		$scope.isDataVisible = false;
		$scope.isImageVisible = true;
	}
	
	$scope.hideAll = function(){
		$scope.isDataVisible = false;
		$scope.isPckgVisible = false;
	}
});

/*JQuery function */
$(document).ready(function(){
    $(".imgdata").click(function(){
	  $(this).next().slideToggle("medium");
	});	
     $(".imgdata1").click(function(){
	  $(this).next().slideToggle("medium");
	});	
	
	 $(".outputBuild").click(function(){
	  $(this).next().slideToggle("medium");
	});	
     $(".outputBuild1").click(function(){
	  $(this).next().slideToggle("medium");
	});
});

/* Output Image */
$(function(){
    $('.button1').on('click',function(){
      var source = $(this).data('src');
      $('#image1').html('<button class = "innerButton outputBuild">Build</button><div class = "outputImg"><img src="'+source+'" alt="" height = "150" width = "150"/></div>');
    });
	$('.button2').on('click',function(){
      var source = $(this).data('src');
      $('#image2').html('<button class = "innerButton outputBuild1">Package</button><div class = "outputImg1"><img src="'+source+'" alt="" height = "150" width = "150"/></div>');
    });
});
