'use strict';
var myapp = angular.module('blogApp');
myapp.controller('signInController',['$scope', function($scope){
      $scope.message='Clear message';
}]);
myapp.controller('registerController',['$scope', function($scope){
      $scope.message='';
      $scope.register=function(){
      };
}]);
