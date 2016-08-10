
var myapp = angular.module('blogApp',[
  'ngRoute',
  'angular-oauth2'
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
  .otherwise({redirectTo:'/'});
  $locationProvider.html5Mode({
  enabled: true,
  requireBase: false
});
});
