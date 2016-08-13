'use strict';
var myapp = angular.module('blogApp');
myapp.controller('postController',['$scope','$location','$http', function($scope,$location,$http){
  $scope.tinymceModel = 'Initial content';
  $scope.title='';

$scope.getContent = function() {
  console.log('Editor content:', $scope.tinymceModel);
  $http({
    method: 'POST',
    url: 'http://localhost:8080/saveArticle',
    data:{
      upVotes: "50",
      title : $scope.title,
      html : $scope.tinymceModel,
      createdBy : "Priyank",
      createdDate : new Date()
    }
  }).then(function(response){
    alert('success');
  }, function(response){

  });
};

$scope.setContent = function() {
  $scope.tinymceModel = 'Time: ' + (new Date());
};

$scope.tinymceOptions = {
  plugins: 'advlist autolink link image lists charmap print preview',
  toolbar: 'undo redo | bold italic | alignleft aligncenter alignright | code'
};
}]);
