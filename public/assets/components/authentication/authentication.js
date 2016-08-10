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
myapp.controller('signInController',['$scope', function($scope){
      $scope.message='';

}]);
myapp.controller('registerController',['$scope', function($scope){
      $scope.message='';
      $scope.register=function(){
      };
}]);
