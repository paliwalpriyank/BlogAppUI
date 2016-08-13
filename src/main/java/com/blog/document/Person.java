package com.blog.document;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Document
public class Person extends AbstractDocument{

	private String firstName;
	private String lastName;
	private String email;
	
	private String password;
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@JsonIgnore
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public Person(){
		
	}
	public Person(String firstName, String lastName, String email, String password){
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.password=password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String toString(){
		return "Person["+"name]";
	}
	
	
}
