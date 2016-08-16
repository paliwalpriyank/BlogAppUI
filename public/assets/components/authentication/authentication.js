'use strict';
var myapp = angular.module('blogApp');

myapp.controller('signInController',['$scope','$http','Auth','$location', function($scope,$http,Auth,$location){
      $scope.email='';
      $scope.password='';
      if(Auth.isLoggedIn()){
        $location.path( "/userDashboard" );
      }
      $scope.signIn = function(){
        $http({
          method: 'POST',
          url: 'http://localhost:8080/authenticate',
          data:{
            email : $scope.email,
            password : $scope.password
          }
        }).then(function(response){
          if(response.data.email!==null){
                Auth.setUser(response.data.email);
                $location.path( "/userDashboard" );
          }
          $scope.message = "Invalid username or password. Please Retry!";
        }, function(response){
            $scope.message = "Invalid username or password. Please Retry!";
        });
      };
}]);
myapp.controller('registerController',['$scope','$http','$location', function($scope,$http,$location){
      $scope.message='';
      $scope.email='';
      $scope.firstName='';
      $scope.lastName='';
      $scope.password='';
      $scope.register=function(){
        $http({
          method: 'POST',
          url: 'http://localhost:8080/register',
          data:{
            firstName : $scope.firstName,
            lastName : $scope.lastName,
            email : $scope.email,
            password : $scope.password
          }
        }).then(function(response){
          $location.path('/');
        }, function(response){

        });
      };
}]);
