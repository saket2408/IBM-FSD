package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Ingredient;
import com.example.model.Reciepe;
@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, Long> {

	List<Ingredient> findAllByReciepes(Reciepe reciepe);
}
