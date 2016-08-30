package com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blog.dao.UserDaoImpl;
import com.blog.document.Person;

@RestController
public class UserController {
	
	@Autowired
	UserDaoImpl registerDao;
	
	@CrossOrigin(origins = "http://localhost:8081")
	@RequestMapping(method = RequestMethod.POST,value="/register")
	public String register(@RequestBody Person person){
		registerDao.insertPerson(person);
		return "{\"success\": true}";
	}
	
	@CrossOrigin(origins = "http://localhost:8081")
	@RequestMapping(method = RequestMethod.POST,value="/authenticate")
	public Person authUser(@RequestBody Person person){
		Person personAuth =registerDao.authPerson(person.getEmail(), person.getPassword());
		if(personAuth.getPassword().equals(person.getPassword())){
			personAuth.setPassword("");
			return personAuth;
		}		
		return new Person();
	}
	
}
