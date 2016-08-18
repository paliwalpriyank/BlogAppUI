'use strict';
var myapp = angular.module('blogApp');
myapp.controller('headerController',['$scope','$location','Auth', function($scope,$location,Auth){
      $scope.message = '';
      $scope.isLoggedIn = false;
      $scope.register=function(){
        $location.path( "/register" );
      };
      $scope.signIn=function(){
        $location.path( "/" );
      };
      $scope.signOut=function(){
        Auth.logOut();
        $location.path( "/" );
      };
      $scope.enableAuth=function(){
        return Auth.isLoggedIn();
      };
}]);
