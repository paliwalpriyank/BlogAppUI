package com.blog.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

import com.blog.document.Person;
import com.blog.repository.PersonRepository;

@Component
public class UserDaoImpl {

	@Autowired private PersonRepository personRepository;
	@Autowired private MongoOperations operations;
	public void insertPerson(Person person){
	 personRepository.save(person);
	}
	public Person authPerson(String email, String password){
		 return personRepository.findByEmailAndPassword(email,password);
	}
}
