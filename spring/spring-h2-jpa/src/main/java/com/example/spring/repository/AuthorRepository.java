package com.example.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.model.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
