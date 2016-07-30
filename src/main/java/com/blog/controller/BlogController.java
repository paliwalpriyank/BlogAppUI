package com.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
	
	@RequestMapping("/")
	public String display(){
		return "My First Controller";
	}
}
