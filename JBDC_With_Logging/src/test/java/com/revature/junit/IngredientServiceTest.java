package com.revature.junit;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.revature.model.Ingredient;
import com.revature.service.IngredientService;

@TestInstance(Lifecycle.PER_CLASS)
public class IngredientServiceTest {

	
	private IngredientService ingredientService;
	
	@BeforeAll
	public void setup() {
		ingredientService = new IngredientService();
	}
	
	
	@Test
	public void testFindAllOrderByName() {
		List<Ingredient> orderedIngredients = ingredientService.findAllOrderedByName();
		
		Assertions.assertTrue(orderedIngredients.get(0).getName().compareTo(orderedIngredients.get(1).getName()) < 0);
	}
}
