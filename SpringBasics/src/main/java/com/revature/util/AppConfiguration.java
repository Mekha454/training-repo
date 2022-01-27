package com.revature.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.revature.controller.RecipeController;
import com.revature.repository.RecipeRepository;

/*
 * can add custom beans (highly customized instances of built-in Spring types to IoC container via Configuration class
 * -user @Configuration annotation above this class
 */

@Configuration
/*
 * equivalent of <context:component-scan base-package="com.revature"></context:component-scan>
 */
@ComponentScan(basePackages ="com.revature")
public class AppConfiguration {
	
	@Bean(name = "recipeController2")
	public RecipeController getRecipeController() {
		return new RecipeController();
	}
	
	//using a config class is not necessary for something that requires little configuration

}
