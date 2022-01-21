package project0;

import java.util.Scanner;

import project0.repos.AdminRepo;
import project0.repos.UserRepo;


public class Bidness {
	static Bidness b = new Bidness();
	
	public static void main(String[] args) {
		
		//ItemRepo itemRepo = new ItemRepoImpl();
		
		//UserRepo userRepo = new UserRepoImpl();
		
		
		

		b.mainMenu();
	}
	public void mainMenu() {
		Scanner scan = new Scanner(System.in);
				System.out.println("Welcome to Lakeview General Goods!  Please choose an option below: \n 1: Create Account\n 2: Login\n 3: Exit");
		int option = scan.nextInt();
		switch(option){
		case 1:
			Account.signUp();
			break;
		case 2:
			Account.login();
			break;
		case 3:
			System.out.println("Goodbye!");
			scan.close();
			break;
			}
	}
			
	
	
	
	
	
	
	
		


}
