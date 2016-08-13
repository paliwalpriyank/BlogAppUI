'use strict';
var myapp = angular.module('blogApp');
myapp.controller('articleController',['$scope','$location','$http', function($scope,$location,$http){
$scope.allArticles='';
  $http({
    method: 'GET',
    url: 'http://localhost:8080/getAllArticles'
  }).then(function(response){
    $scope.allArticles = response.data;
    alert('success'+response.data[0].title);
  }, function(response){
  });


}]);
