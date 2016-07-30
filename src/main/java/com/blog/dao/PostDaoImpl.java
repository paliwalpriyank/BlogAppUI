package com.blog.dao;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.stereotype.Component;

import com.blog.document.Person;
import com.blog.repository.MongoDbCustomerRepository;
import com.mongodb.Mongo;

@Component
public class PostDaoImpl {
	@Autowired
	MongoOperations mongoOps;
	/*@Autowired
	private MongoDbCustomerRepository mog;*/
	
	public void save(){
		Person p= new Person();
		p.setEmail("paliwal.priyank@gmail.com");
		p.setName("Priyank");
		//MongoDbCustomerRepository md= new MongoDbCustomerRepository(mo);
		//mog.save(p);
		
		MongoOperations mongoOps;
		
			mongoOps = new MongoTemplate(new SimpleMongoDbFactory(new Mongo(), "blog"));
		//mog.save(p);
			mongoOps.insert(p);
		
		
	/*	Person p=new Person();
		p.setName("Priyank");
		mo.insert(p);
		System.out.print("Inserted");*/
		
	}

}
