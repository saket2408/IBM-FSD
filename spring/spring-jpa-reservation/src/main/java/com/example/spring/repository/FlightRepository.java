package com.example.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.model.Flight;
@Repository
public interface FlightRepository extends CrudRepository<Flight ,Integer> {

}
