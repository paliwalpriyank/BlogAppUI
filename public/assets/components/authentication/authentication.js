'use strict';
var myapp = angular.module('blogApp');

myapp.controller('signInController',['$scope','$http','Auth', function($scope,$http,Auth){
      $scope.email='';
      $scope.password='';
      $scope.signIn = function(){
        $http({
          method: 'POST',
          url: 'http://localhost:8080/authenticate',
          data:{
            email : $scope.email,
            password : $scope.password
          }
        }).then(function(response){
          alert('done'+response.data.email);
          Auth.setUser(response.data.email);
        }, function(response){

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
          $location.path('/post');
        }, function(response){

        });
      };
}]);
