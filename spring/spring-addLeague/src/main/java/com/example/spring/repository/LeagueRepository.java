package com.example.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.model.League;

@Repository
public interface LeagueRepository extends CrudRepository<League, Integer> {

}
