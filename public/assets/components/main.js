'use strict';
var myapp = angular.module('blogApp');
myapp.controller('headerController',['$scope','$location', function($scope,$location){
      $scope.message='';
      $scope.register=function(){
      $location.path( "/register" );
      };
      $scope.signIn=function(){
      $location.path( "/" );
      };
}]);
