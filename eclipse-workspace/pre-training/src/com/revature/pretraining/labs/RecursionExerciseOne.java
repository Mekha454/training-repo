package com.revature.pretraining.labs;

public class RecursionExerciseOne {

	public void printChar(char input) {
		 if (input < 'a' || input > 'z') return;

		 System.out.print(input);
		 input -= 1;
		 printChar(input);
		}
}
