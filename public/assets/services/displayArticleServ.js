'use strict';
var myapp = angular.module('blogApp')
.factory('displayArticleService', function(){
var articleContent;
var articleId;
return{
    setArticle : function(id, article){
        articleContent = article;
        articleId = id
    },
    getArticleContent: function(){
        return(articleContent)? articleContent : false;
    },
    getArticleId: function(){
        return(articleId)? articleId : false;
    }
  }
});
