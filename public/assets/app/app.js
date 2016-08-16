
var myapp = angular.module('blogApp',[
  'ngRoute',
  'angular-oauth2',
  'ui.tinymce',
  'angularUtils.directives.dirPagination',
  'ngSanitize'
]);
myapp.config(function($routeProvider, $locationProvider){
  $routeProvider.when('/',{
    templateUrl:'assets/components/authentication/signInForm.html',
    controller:'signInController'
  })
  .when('/register',{
    templateUrl:'assets/components/authentication/registerForm.html',
    controller:'registerController'
  })
  .when('/post',{
    templateUrl:'assets/components/newPost/newPost.html',
    controller:'postController'
  })
  .when('/allArticles',{
    templateUrl:'assets/components/articleListings/article.html',
    controller:'articleController'
  })
  .when('/displayArticle',{
    templateUrl:'assets/components/showArticle/displayArticle.html',
    controller:'displayController'
  })
  .when('/userDashboard',{
    templateUrl:'assets/components/userArticles/userArticle.html',
    controller:'userController'
  })
  .otherwise({redirectTo:'/'});
  $locationProvider.html5Mode({
  enabled: true,
  requireBase: false
});
});
