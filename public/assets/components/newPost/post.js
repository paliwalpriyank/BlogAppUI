'use strict';
var myapp = angular.module('blogApp');
myapp.controller('postController',['$scope','$location', function($scope,$location){
  $scope.tinymceModel = 'Initial content';

$scope.getContent = function() {
  console.log('Editor content:', $scope.tinymceModel);
};

$scope.setContent = function() {
  $scope.tinymceModel = 'Time: ' + (new Date());
};

$scope.tinymceOptions = {
  plugins: 'advlist autolink link image lists charmap print preview',
  toolbar: 'undo redo | bold italic | alignleft aligncenter alignright | code'
};
}]);
