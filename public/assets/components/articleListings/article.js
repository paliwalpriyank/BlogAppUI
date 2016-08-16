'use strict';
var myapp = angular.module('blogApp');
myapp.controller('articleController',['$scope','$location','$http','displayArticleService', function($scope,$location,$http,displayArticleService){
$scope.allArticles='';
  $http({
    method: 'GET',
    url: 'http://localhost:8080/getAllArticles'
  }).then(function(response){
    $scope.allArticles = response.data;

  }, function(response){
  });
$scope.display=function(cut){
  var cuthtml = '<div class = "container text-left"> <header class="text-left"><h2>'+cut.title +'</h2></header>' +cut.html+'</div>';
  displayArticleService.setArticle(cut.id, cuthtml);
  $location.path( "/displayArticle" );
};
}]);
