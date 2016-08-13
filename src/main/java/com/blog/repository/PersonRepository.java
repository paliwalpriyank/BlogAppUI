package com.blog.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blog.document.Person;


public interface PersonRepository extends MongoRepository<Person, String> {
	List<Person> findById(String id, Sort sort);
	Person findByEmail(String email);
}
