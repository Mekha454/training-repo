package com.revature.pretraining.labs;

public class MethodExercise {

	public static void main(String[] args) {
		MethodExercise me = new MethodExercise();
		
		int num = me.randomNumber();
		
		System.out.println(num);
	}
	
	public int randomNumber() {
		int result = (int) (Math.random() * 50) + 1;
		
		return result;
	}
}
