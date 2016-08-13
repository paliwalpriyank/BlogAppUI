package com.blog.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.blog.document.Article;

public interface ArticleRepository extends MongoRepository<Article, String>{
	List<Article> findByCreatedBy(String createdBy);
}
