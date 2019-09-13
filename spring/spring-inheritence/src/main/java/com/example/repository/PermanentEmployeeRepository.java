package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.PermanentEmployee;

@Repository
public interface PermanentEmployeeRepository extends CrudRepository<PermanentEmployee, Integer> {

}
