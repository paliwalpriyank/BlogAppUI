'use strict';
var myapp = angular.module('blogApp');

myapp.controller('signInController',['$scope', function($scope){
      $scope.message='';

}]);
myapp.controller('registerController',['$scope', function($scope){
      $scope.message='';
      $scope.register=function(){
      };
}]);
