import com.revature.model.Ingredient;
import com.revature.repository.IngredientRepoImpl;
import com.revature.repository.IngredientRepository;

public class Driver {

	public static void main(String[] args) {
	
		IngredientRepository ingredientRepository = new IngredientRepoImpl();
		
		System.out.println(ingredientRepository.findAll());
		
		//System.out.println(ingredientRepository.findById(2));
		
		//creating new ingredient to persist to database
		
//		Ingredient newIngredient = new Ingredient(0,"Sugar","sweet", 0.0f);
//		ingredientRepository.save(newIngredient);
			
		//Ingredient updatedIngredient = new Ingredient(0, "Tofu", "bland", 0.0f);
		//ingredientRepository.update(updatedIngredient);
		//System.out.println(ingredientRepository.findByName("Salt"));
	}

	
}
