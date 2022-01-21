package com.revature.junit;

import com.revature.model.Ingredient;
import com.revature.repository.IngredientRepoImpl;
import com.revature.repository.IngredientRepository;

import java.util.List;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;

/*
 * for this example I ran the tests against my database;
 * this is not good practice as you should never run tests against your production database
 * dangerous because it compromises user data but it is also inefficient as your tests will run slower
 */

@TestInstance(Lifecycle.PER_CLASS)
public class IngredientRepositoryTest {
	
	/*
	 * this is our Object Under Test (the object we're actually running tests against)
	 */
	private IngredientRepository ingredientRepository;

	/*
	 * important to do some setup before writing our tests
	 * We need an instance of the IngredientRepositoryImpl class if we want to test the methods on that type
	 * we'll get a NullPointerException otherwise
	 * 
	 * we'll be using @BeforeAll to perform setup ONCE before any of our tests are run
	 */
	
	@BeforeAll
	public void setup() {
		ingredientRepository = new IngredientRepoImpl();
	}
	@Test
	public void testFindAllIngredients() {
		List<Ingredient> retrievedIngredients = ingredientRepository.findAll();
		Assertions.assertNotNull(retrievedIngredients);
		Assertions.assertEquals(9, retrievedIngredients.size());
	}
}
