package com.blog;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.blog.repository.PersonRepository;

@SpringBootApplication
public class MainApplication {
	
	public static void main(String args[]){
		ApplicationContext ctx =  SpringApplication.run(MainApplication.class, args);
		System.out.println("Staring Application..........");
		String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
	}

}
