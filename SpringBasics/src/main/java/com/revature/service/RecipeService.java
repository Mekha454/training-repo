package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Recipe;
import com.revature.repository.RecipeRepository;

@Service("recipeService")
public class RecipeService {
	
	/*
	 * use @Autowired annotation to wire in beans w/ annotations
	 * -either above field, constructor, or a setter
	 */
	
	@Autowired
	private RecipeRepository recipeRepository;
	
	/*
	 * setter injection: Spring will take setter for recipeRepository property and use it to inject dependency
	 */
	
//	public void setRecipeRepository(RecipeRepository recipeRepository) {
//		this.recipeRepository = recipeRepository;
//	}
	
	public List<Recipe> findAll(){
		return this.recipeRepository.findAll();
	}

}
