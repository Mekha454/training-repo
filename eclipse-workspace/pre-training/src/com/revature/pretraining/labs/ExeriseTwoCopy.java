package com.revature.pretraining.labs;
import java.util.Scanner;

public class ExeriseTwoCopy {
	
	public static void mover() {
		 Scanner scanner = new Scanner(System.in);
		 boolean exit = false;
		 System.out.println("Please type in one of the following:");
		 System.out.println("* 1 - Move Right");
		 System.out.println("* 2 - Move Left");
		 System.out.println("* 3 - Move Up");
		 System.out.println("* 4 - Move Down");
		 System.out.println("* q - exit program");
		 while (scanner.hasNext()) {

		 String input = scanner.next();

		 switch(input) {
		 case "1": {
		 System.out.println("Moving Right"); break;
		 }
		 case "2": {
		 System.out.println("Moving Left"); break;
		 }
		 case "3": {
		 System.out.println("Moving Up"); break;
		 }
		 case "4": {
		 System.out.println("Moving Down"); break;
		 }
		 case "q": {
		 System.out.println("Moving Left"); exit = true; break;
		 }
		 default: {
		 System.out.println("Try again. Accepatable input: [1 - Move right,"
		 		+ " 2 - Move Left, 3 - Move Up, 4 - Move Down, q - exit program]");
		 }
		 }

		 if (exit) {
		 System.out.println("Exiting program...");
		 break;
		 }
		 }
		 scanner.close(); 

}
}