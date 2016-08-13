package com.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
@Configuration
public class MongoConfig {
	 public @Bean MongoDbFactory mongoDbFactory() throws Exception {
		    
		    return new SimpleMongoDbFactory(new MongoClient(), "blog");
		  }

		  public @Bean MongoTemplate mongoTemplate() throws Exception {
		    return new MongoTemplate(mongoDbFactory());
		  }
}
