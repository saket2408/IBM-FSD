package com.example.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.model.Publisher;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Integer> {

}
