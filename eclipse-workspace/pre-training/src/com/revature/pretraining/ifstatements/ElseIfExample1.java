package com.revature.pretraining.ifstatements;

public class ElseIfExample1 {

	public static void main(String[] args) {
		boolean a = false;
		boolean b = true;
		
		if(a) {
			System.out.println("Inside the if-statement");
		}
			else if (b) {
				System.out.println("inside the else-if statement");
			}
			else {
				System.out.println("inside the else-statement");
		}
	}
}
