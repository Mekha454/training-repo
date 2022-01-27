package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.revature.controller.RecipeController;
import com.revature.util.AppConfiguration;


public class Driver {
	
	RecipeController recipeController;
	
	public static void main(String[] args) {
		
			
		//proof the recipeController bean is in the IoC container
		
		//first used XML application context
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//transition to more annotation-based configuration
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		RecipeController recipeController = context.getBean("recipeController2", RecipeController.class);
		
		
		System.out.println(recipeController.findAll());
	}

}
