'use strict';
var myapp = angular.module('blogApp')
.factory('Auth', function(){
var user;
return{
    setUser : function(aUser){
        user = aUser;
    },
    logOut: function(){
      user = undefined;
    },
    isLoggedIn : function(){
        return(user)? user : false;
    }
  }
});
