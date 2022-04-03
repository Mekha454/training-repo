package com.revature.pretraining.whileloops;

public class DoWhileExampleOne {

	public static void main(String[] args) {
		int value = 1;
		
		do {
			System.out.println(value + "+" + value + "=" + (value + value) );
			value++;
			
		}while(value < 11);
	}
}
