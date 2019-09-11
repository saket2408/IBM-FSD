package com.example.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.model.Reservation;
@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Integer> {

}
