package com.revature.service;

import java.util.Collections;
import java.util.List;

import com.revature.model.Ingredient;
import com.revature.repository.IngredientRepoImpl;
import com.revature.repository.IngredientRepository;

public class IngredientService {

	private IngredientRepository ingredientRepository = new IngredientRepoImpl();
	
	public List<Ingredient> findAllOrderedByName(){
		
		List<Ingredient> retrievedIngredients = ingredientRepository.findAll();
		
		Collections.sort(retrievedIngredients,
				(i1, i2) -> i1.getName().compareTo(i2.getName()));
		
		return retrievedIngredients;
	}

}
