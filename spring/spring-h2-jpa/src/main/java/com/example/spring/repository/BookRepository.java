package com.example.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{

}
