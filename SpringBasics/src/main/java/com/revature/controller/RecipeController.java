package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.revature.model.Recipe;
import com.revature.service.RecipeService;

@Controller("recipeController")
public class RecipeController {
	
	@Autowired
	private RecipeService recipeService;
	
	/*
	 * Spring has several ways of injecting needed dependencies
	 * - a standard way is via the constructor of a bean
	 */
//	public RecipeController(RecipeService recipeService) {
//		this.recipeService = recipeService;
//	}

	public List<Recipe> findAll(){
		return this.recipeService.findAll();
	}
}
