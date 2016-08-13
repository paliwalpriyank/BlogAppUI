package com.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blog.dao.ArticleDaoImpl;
import com.blog.document.Article;

@RestController
public class ArticleController {
	@Autowired ArticleDaoImpl articleDao;
	
	@CrossOrigin(origins = "http://localhost:8081")
	@RequestMapping(method = RequestMethod.POST,value="/saveArticle")
	public String saveArticle(@RequestBody Article article){
		articleDao.insertArticle(article);
		return "{\"success\": true}";
	}
	
	@CrossOrigin(origins = "http://localhost:8081")
	@RequestMapping(method = RequestMethod.POST,value="/getUserArticles")
	public List<Article> getUserArticles(@RequestBody Article article){
		return articleDao.getUserArticles(article.getCreatedBy());		
	}
	
	@CrossOrigin(origins = "http://localhost:8081")
	@RequestMapping(method = RequestMethod.GET,value="/getAllArticles")
	public List<Article> getAllArticles(){
		return articleDao.getAllArticles();
		
	}
}
