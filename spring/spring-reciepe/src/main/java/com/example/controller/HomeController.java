package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Ingredient;
import com.example.model.Note;
import com.example.model.Reciepe;
import com.example.repository.IngredientRepository;
import com.example.repository.NoteRepository;
import com.example.repository.ReciepeRepository;

@Controller
public class HomeController {
	
	private ReciepeRepository reciepeRepository;
	private IngredientRepository ingredientRepository;
	private NoteRepository noteRepository;
	
	
	

	public HomeController(ReciepeRepository reciepeRepository, IngredientRepository ingredientRepository,
			NoteRepository noteRepository) {
		super();
		this.reciepeRepository = reciepeRepository;
		this.ingredientRepository = ingredientRepository;
		this.noteRepository = noteRepository;
	}

	@GetMapping("/")
	public String goHome(Model theModel) {
		theModel.addAttribute("reciepes" , reciepeRepository.findAll());
		return "index";
		
	}
	
	@PostMapping("/viewRecipe")
	public String viewRecipe(Model theModel, @RequestParam("id") Long id) {
		Optional<Reciepe> result = reciepeRepository.findById(id);
		Reciepe reciepe = result.get();
		theModel.addAttribute("reciepe" , reciepe);
		Optional<Note> noteResult = noteRepository.findByReciepe(reciepe);
		Note note = noteResult.get();
		theModel.addAttribute("note" , note);
		List<Ingredient> ingredient = ingredientRepository.findAllByReciepes(reciepe);
		theModel.addAttribute("ingredient" , ingredient);
		return "show-recipe";
		
	}
	
}
