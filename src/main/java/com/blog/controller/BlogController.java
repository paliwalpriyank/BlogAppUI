package com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.dao.PostDaoImpl;

@RestController
public class BlogController {
	@Autowired PostDaoImpl pdi;
	@RequestMapping("/")
	public String display(){
		pdi.insertPerson();
		return "My First Controller";
	}
}
