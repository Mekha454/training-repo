package com.revature.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.revature.model.Recipe;


@Repository("recipeRepository")
public class RecipeRepository {
	
	public List<Recipe> findAll(){
		return Arrays.asList(new Recipe(1, "Pancakes", "flat bread"),
				new Recipe(2, "Grits", "some corn product"), 
				new Recipe(3, "Shrimp", "shramp!"));
	}

}
