package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Reciepe;

@Repository
public interface ReciepeRepository extends CrudRepository<Reciepe, Long> {

}
