package com.example.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.model.Passenger;
@Repository
public interface PassengerRepository extends CrudRepository<Passenger, Integer> {

}
