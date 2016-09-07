'use strict';
var myapp = angular.module('blogApp');
myapp.controller('displayController',['$scope','$location','$http','displayArticleService', function($scope,$location,$http,displayArticleService){
$scope.displayArticle=displayArticleService.getArticleContent();

}]);
