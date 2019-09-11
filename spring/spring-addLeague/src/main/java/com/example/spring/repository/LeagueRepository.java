package com.example.spring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.model.League;

@Repository
public interface LeagueRepository extends CrudRepository<League, Integer> {
	public List<League> findAllByOrderByTitleAsc(); 
	public List<League> findAllByTitleContainingIgnoreCaseOrSeasonContainingIgnoreCase(String title,String season);
}
