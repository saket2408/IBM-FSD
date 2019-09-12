package com.example.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Note;
import com.example.model.Reciepe;

@Repository
public interface NoteRepository extends CrudRepository<Note, Long>{
	Optional<Note> findByReciepe(Reciepe reciepe); 

}
