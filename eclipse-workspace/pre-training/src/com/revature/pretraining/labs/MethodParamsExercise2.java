package com.revature.pretraining.labs;

public class MethodParamsExercise2 {

	public String findFirstWord(String a, String b) {
		
		char[] aArray = a.toCharArray();
		char[] bArray = b.toCharArray();
		
		for (int i = 0; i < aArray.length; i++) {
			if (aArray[i] < bArray[i]) {
				return a;
			}
			
			if(aArray[i] > bArray[i]) {
				return b;
			}
		}
	
	return a;
}
}
