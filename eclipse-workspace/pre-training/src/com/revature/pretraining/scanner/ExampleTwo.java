package com.revature.pretraining.scanner;
import java.util.Scanner;

public class ExampleTwo {

	public static void main(String[] args) {
		
		String numbers = "1 2 3 5 7 9";
		
		Scanner scanner = new Scanner(numbers);
		
		while (scanner.hasNextInt()) {
			System.out.print(scanner.nextInt());
			
			if (scanner.hasNextInt()) {
				System.out.print(",");
				
			}
		}
		scanner.close();
		
	}
}
