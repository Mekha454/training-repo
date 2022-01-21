package com.revature.repository;

import java.util.List;

import com.revature.model.Ingredient;

public interface IngredientRepository {

	/**
	 * @param ingredient an ingredient that will be persisted to database
	 */
	void save(Ingredient ingredient); //to add a new ingredient
	
	/**
	 * 
	 * @param id the primary key is used to locate the ingredient
	 */
	Ingredient findById(int id);
	
	/**
	 * 
	 * @param name the name of the ingredient in the database
	 */
	
	Ingredient findByName(String name);
	
	/**
	 * this method locates every single ingredient in our database
	 */
	List<Ingredient> findAll();
	
	/**
	 * 
	 * @param ingredient the ingredient that will be updated in our database
	 */
	void update(Ingredient ingredient);
	
	/**
	 * 
	 * @param ingredient the ingredient that will be deleted from the database
	 */
	
	void delete(Ingredient ingredient);
}
