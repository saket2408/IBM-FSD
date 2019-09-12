package com.example.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.model.Ingredient;
import com.example.model.Note;
import com.example.model.Reciepe;
import com.example.repository.IngredientRepository;
import com.example.repository.NoteRepository;
import com.example.repository.ReciepeRepository;

@Component
public class JpaBootstrap implements ApplicationListener<ContextRefreshedEvent>{


		private ReciepeRepository reciepeRepository;
		private NoteRepository noteRepository;
		private IngredientRepository ingredientRepository;
		
		

		public JpaBootstrap(ReciepeRepository reciepeRepository, NoteRepository noteRepository,
				IngredientRepository ingredientRepository) {
			super();
			this.reciepeRepository = reciepeRepository;
			this.noteRepository = noteRepository;
			this.ingredientRepository = ingredientRepository;
		}

		@Override
		public void onApplicationEvent(ContextRefreshedEvent event) {
			// TODO Auto-generated method stub
			init();
		}

		private void init() {
			Reciepe chickenBiryani = new Reciepe("Chicken Biryani",120L, "moderate", "Rinse rice several times and allow to sit in water"
					+ " for at least two hours prior to" + 
					"cooking." + 
					"Boil rice with salt, a little cumin, 1 cinnamon stick and 2 cardamom pods for" + 
					"about two minutes. Remove about 1/3 of it after about one and a half minutes" + 
					"of cooking. Drain and set rice aside separately." + 
					"Blend about 1/3 of the onions with the ginger and garlic, slice the rest of the" + 
					"onions and fry until brown." + 
					"Chop mint and coriander separately and slit chillies." + 
					"Peel potatoes and cut into large pieces, fry until golden. Peel and fry eggs as" + 
					"well." + 
					"Combine lamb cubes with yoghurt, salt, blended onion mixture, the remaining" + 
					"whole spices, about half of the fried onions, coriander and mint. Stir well and" + 
					"add potatoes, making sure potatoes get covered by the spice mixture. Add" + 
					"about two tablespoons of oil." + 
					"Place lamb mixture in a large pot, smoothing it out on the top. (Some people" + 
					"like to line the bottom of the pot with thin slices of potato to ensure that the" + 
					"meat doesn’t burn)." + 
					"Spread the lesser cooked portion of rice on top of the meat, trying to ensure" + 
					"that the top is as flat as possible. Sprinkle with half of the remaining fried" + 
					"onions and add the fried eggs on top. Now add the remaining rice, top with" + 
					"remaining fried onions and sprinkle the top with saffron strands and saffron" + 
					"water." + 
					"Cover tightly and cook over medium-low heat for 60-90 minutes. After about" + 
					"60 minutes, forge with spoon handle to see whether rice is cooked.", 200L, 12L, 
					"Rani Cuisine","http://raniscuisine.com/Ranis_Cuisine/Recipes_files/Biryani.pdf");
			
			Reciepe vegBiryani = new Reciepe("Veg Biryani",100L, "easy", "Rinse rice several times and allow to sit in water"
					+ " for at least two hours prior to" + 
					"cooking." + 
					"Boil rice with salt, a little cumin, 1 cinnamon stick and 2 cardamom pods for" + 
					"about two minutes. Remove about 1/3 of it after about one and a half minutes" + 
					"of cooking. Drain and set rice aside separately." + 
					"Blend about 1/3 of the onions with the ginger and garlic, slice the rest of the" + 
					"onions and fry until brown." + 
					"Chop mint and coriander separately and slit chillies." + 
					"Peel potatoes and cut into large pieces, fry until golden. Peel and fry eggs as" + 
					"well." + 
					"Combine lamb cubes with yoghurt, salt, blended onion mixture, the remaining" + 
					"whole spices, about half of the fried onions, coriander and mint. Stir well and" + 
					"add potatoes, making sure potatoes get covered by the spice mixture. Add" + 
					"about two tablespoons of oil." + 
					"Place lamb mixture in a large pot, smoothing it out on the top. (Some people" + 
					"like to line the bottom of the pot with thin slices of potato to ensure that the" + 
					"meat doesn’t burn)." + 
					"Spread the lesser cooked portion of rice on top of the meat, trying to ensure" + 
					"that the top is as flat as possible. Sprinkle with half of the remaining fried" + 
					"onions and add the fried eggs on top. Now add the remaining rice, top with" + 
					"remaining fried onions and sprinkle the top with saffron strands and saffron" + 
					"water." + 
					"Cover tightly and cook over medium-low heat for 60-90 minutes. After about" + 
					"60 minutes, forge with spoon handle to see whether rice is cooked.", 150L, 10L, 
					"Rani Cuisine","http://raniscuisine.com/Ranis_Cuisine/Recipes_files/Biryani.pdf");
			
			Note recipeNote1 =new Note("Serve it hot. With proper presentation");
			Note recipeNote2 =new Note("Serve it hot. With proper presentation");
			recipeNote1.setReciepe(chickenBiryani);
			recipeNote2.setReciepe(vegBiryani);

			
			chickenBiryani.setNote(recipeNote1);
			vegBiryani.setNote(recipeNote2);
			
			
			Ingredient ingredient1 = new Ingredient("1 kg Patatoes" , "cut in large pieces");
			Ingredient ingredient2 = new Ingredient("1.5 kg basmati rice", "preferably aged ");
			Ingredient ingredient3 = new Ingredient("2 kg chicken", "cut in large cubes");
			Ingredient ingredient4 = new Ingredient("1 kg onions" , "");
			Ingredient ingredient5 = new Ingredient("100g ginger", "crushed");
			Ingredient ingredient6 = new Ingredient("100g garlic" , " crushed");
			Ingredient ingredient7 = new Ingredient("1 small bunch coriander", "");
			Ingredient ingredient8 = new Ingredient("4 green chillies", "");
			Ingredient ingredient9 = new Ingredient("1 bunch mint leaves" , "");
			Ingredient ingredient10 = new Ingredient("3 cinnamon sticks", "");
			Ingredient ingredient11 = new Ingredient("1kg tomato", "cut in large cubes");
			
			chickenBiryani.getIngredients().add(ingredient1);
			chickenBiryani.getIngredients().add(ingredient2);
			chickenBiryani.getIngredients().add(ingredient3);
			chickenBiryani.getIngredients().add(ingredient4);
			chickenBiryani.getIngredients().add(ingredient5);
			chickenBiryani.getIngredients().add(ingredient6);
			chickenBiryani.getIngredients().add(ingredient7);
			chickenBiryani.getIngredients().add(ingredient8);
			chickenBiryani.getIngredients().add(ingredient9);
			chickenBiryani.getIngredients().add(ingredient10);
			ingredient1.getReciepes().add(chickenBiryani);
			ingredient2.getReciepes().add(chickenBiryani);
			ingredient3.getReciepes().add(chickenBiryani);
			ingredient4.getReciepes().add(chickenBiryani);
			ingredient5.getReciepes().add(chickenBiryani);
			ingredient6.getReciepes().add(chickenBiryani);
			ingredient7.getReciepes().add(chickenBiryani);
			ingredient8.getReciepes().add(chickenBiryani);
			ingredient9.getReciepes().add(chickenBiryani);
			ingredient10.getReciepes().add(chickenBiryani);
			
			
			
			
			vegBiryani.getIngredients().add(ingredient1);
			vegBiryani.getIngredients().add(ingredient2);
			vegBiryani.getIngredients().add(ingredient11);
			vegBiryani.getIngredients().add(ingredient4);
			vegBiryani.getIngredients().add(ingredient5);
			vegBiryani.getIngredients().add(ingredient6);
			vegBiryani.getIngredients().add(ingredient7);
			vegBiryani.getIngredients().add(ingredient8);
			vegBiryani.getIngredients().add(ingredient9);
			vegBiryani.getIngredients().add(ingredient10);
			ingredient1.getReciepes().add(vegBiryani);
			ingredient2.getReciepes().add(vegBiryani);
			ingredient11.getReciepes().add(vegBiryani);
			ingredient4.getReciepes().add(vegBiryani);
			ingredient5.getReciepes().add(vegBiryani);
			ingredient6.getReciepes().add(vegBiryani);
			ingredient7.getReciepes().add(vegBiryani);
			ingredient8.getReciepes().add(vegBiryani);
			ingredient9.getReciepes().add(vegBiryani);
			ingredient10.getReciepes().add(vegBiryani);
			
			noteRepository.save(recipeNote1);
			noteRepository.save(recipeNote2);
			reciepeRepository.save(chickenBiryani);
			reciepeRepository.save(vegBiryani);
			ingredientRepository.save(ingredient1);
			ingredientRepository.save(ingredient2);
			ingredientRepository.save(ingredient3);
			ingredientRepository.save(ingredient4);
			ingredientRepository.save(ingredient5);
			ingredientRepository.save(ingredient6);
			ingredientRepository.save(ingredient7);
			ingredientRepository.save(ingredient8);
			ingredientRepository.save(ingredient9);
			ingredientRepository.save(ingredient10);
			ingredientRepository.save(ingredient11);

		}


	}



