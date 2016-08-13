package com.blog.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

import com.blog.document.Article;
import com.blog.document.Person;
import com.blog.repository.ArticleRepository;
import com.blog.repository.PersonRepository;

@Component
public class ArticleDaoImpl {
	@Autowired private ArticleRepository articleRepository;
	@Autowired private MongoOperations operations;
	
	public void insertArticle(Article article){
	 articleRepository.save(article);
	}
	public List<Article> getUserArticles(String createdBy){
		return articleRepository.findByCreatedBy(createdBy);
	}
	public List<Article> getAllArticles(){
		return articleRepository.findAll();
	}
}
