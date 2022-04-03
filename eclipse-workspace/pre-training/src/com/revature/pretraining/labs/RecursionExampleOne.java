package com.revature.pretraining.labs;

public class RecursionExampleOne {

	public static void main(String[] args) {
		//create dummy data for method
		int input = 3; 
		RecursionExampleOne eo = new RecursionExampleOne();
		
		// call methods here
		System.out.println(eo.factorial(input));
		
	}
	
	//create first method here
	public int factorial(int num) {
		if (num <= 0) return 0;
		
		if (num == 1) return 1;
		
		return num * factorial(num-1);
		
	}
}
