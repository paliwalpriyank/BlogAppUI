
angular.module('blogApp',[
  'ngRoute'
])
.config(['$locationProvider','$routeProvider', function($locationProvider,$routeProvider){
  $routeProvider.when('/',{
    templateUrl:'assets/components/authentication/signInForm.html',
    controller:'signIn'
  })
  .when('/register',{
    templateUrl:'assets/components/authentication/registerForm.html',
    controller:'register'
  })
  .otherwise({redirectTo:'/'});
}]);
