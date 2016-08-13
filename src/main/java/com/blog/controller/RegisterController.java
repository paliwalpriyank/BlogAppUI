package com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.blog.dao.RegisterDaoImpl;
import com.blog.document.Person;

@RestController
public class RegisterController {
	
	@Autowired
	RegisterDaoImpl registerDao;
	
	
}
