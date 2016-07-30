package com.blog.repository;



import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import com.blog.document.Person;
@NoRepositoryBean
public interface CustomerRepository extends Repository<Person, Long> {
Person findOne(Long id);
Person save(Person customer);

}