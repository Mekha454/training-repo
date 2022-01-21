package project0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
import project0.Bidness;
import project0.implement.UserRepoImpl;
import project0.util.ConnectCloser;
import project0.util.ConnectUtil;
import project0.models.User;
import project0.repos.UserRepo;

public abstract class Account{
	
	static String username;
	static String password;
	
	static Bidness b = new Bidness();

public static void signUp() {
		
		Scanner scan = new Scanner(System.in);
			System.out.println("Welcome!  Please input a Username: ");
				String newUser = scan.next();
				System.out.println("Your username is: " + newUser);
				newUser = username;
			System.out.println("Please input a Password: ");
				String newPass = scan.next();
			System.out.println("Your password has been saved. Don't forget it!\nPlease enter your first and last name: ");
				newPass = password;
				String fullName = scan.next();
				scan.nextLine();
			System.out.println("Please enter the Month you were born in, 1-12: ");
				int birthMonth = scan.nextInt();
				if(birthMonth < 1 | birthMonth > 12) {
					try{ System.out.println("Invalid input. Please try again.");
					birthMonth = scan.nextInt();
					} catch(InputMismatchException e) {
						System.out.println("Invalid Input. Please enter numbers 1-12 only.");
						birthMonth = scan.nextInt(); } }
			System.out.println("Please enter the date you were born: ");
				int birthDay = scan.nextInt();
				if(birthDay < 1 | birthDay > 31) {
					try{ System.out.println("Invalid input. Please try again.");
					birthDay = scan.nextInt();
					} catch(InputMismatchException e) {
						System.out.println("Invalid Input. Please enter numbers 1-31 only.");
						birthDay = scan.nextInt();} }
				scan.nextLine();
			System.out.println("Please enter your street address: ");
				String address = scan.nextLine();
			System.out.println("Please enter your city: ");
				String city = scan.next();
				scan.nextLine();
			System.out.println("Please enter your state: ");
				String state = scan.next();
				scan.nextLine();
			System.out.println("Please enter your phone number: ");
				String phone = scan.next();
				scan.nextLine();
				int balance = 0;
			System.out.println("Please review your information:\nUsername = " + newUser + 
					"\nName: " + fullName + "\nBirthdate: " + birthMonth + " / " + birthDay + "\nAddress: "
					+ address + "\n" + city + ", " + state + "\nPhone #: " + phone + "\nBalance = " + balance);
			User newAcct = new User(newUser, newPass, fullName, birthMonth, birthDay, address, city, state, phone, balance);
			UserRepo userRepo = new UserRepoImpl();
			userRepo.save(newAcct);
			
		scan.close();
		userMenu(username, password);
	}


	
	public static int addToBalance() {
		User user = null;
		final String SQL = "select user_balance from users where user_name = '" + username + "'";
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = ConnectUtil.getConnection();
			stmt = conn.prepareStatement(SQL);
			
			stmt.setInt(1, user.getBalance());
			stmt.setString(2, user.getUserName());
			stmt.execute();
		} catch (SQLException e) {
			System.out.println("No User found.  Please check the Username.");
		}finally {
			ConnectCloser.closeConnection(conn);
			ConnectCloser.closeStatement(stmt);
		}
		Scanner scan = new Scanner(System.in);
		int added;
		String input;
		int balance= 0;
		int newBalance;
			System.out.println("Your account balance is: " + balance);
			System.out.println("Please input the amount you'd like to add to your account:");
				added = scan.nextInt();
				while(added <= 0) {
				try{
				added = scan.nextInt();
					System.out.println("Invalid Input. Please enter positive numbers only.");
				added = scan.nextInt();
				} catch(InputMismatchException e) {
					System.out.println("Invalid Input. Please enter positive numbers only.");
				added = scan.nextInt();
			} }
				
			if(added > 0) {
				newBalance = balance + added;
				System.out.println("Your account balance is " + (newBalance) + ".");
				}
			System.out.println("Would you like to add more? (Y/N)");
				input = scan.next();
								
				if(input.equalsIgnoreCase("Y")) {
//					System.out.println("Please input the amount you'd like to add to your account:");
//					added = scan.nextInt();
//					while(added <= 0) {
//						System.out.println("Invalid Input. Please try again.");
//						added = scan.nextInt();
//					}
//						if(added > 0) {
//						newBalance = balance + added;
//						System.out.println("Your account balance is " + (balance + added) + ". Thank you!");
//						}
					addMore();
					}
				if(input.equalsIgnoreCase("N")) {// make this go back to User menu method
					System.out.println("Thank you!");
					UserRepo userRepo = new UserRepoImpl();
					userRepo.addToBalance(balance);
					scan.close();
					userMenu(username, password);
					}
				return balance;
				
	}
				 
public static void addMore() {
		
		Scanner scan = new Scanner(System.in);
		int balance = 0;
		String input;
		System.out.println("Your account balance is: " + balance);
		System.out.println("Would you like to add more? (Y/N)");
		input = scan.next();
		if(input.equalsIgnoreCase("Y")) {
		System.out.println("Please input the amount you'd like to add to your account:");
		int addBalance = scan.nextInt();
			while(addBalance <= 0 ) {
				try{
					System.out.println("Invalid Input. Please enter positive numbers only.");
				addBalance = scan.nextInt();
				} catch(InputMismatchException e) {
				addBalance = scan.nextInt();
			}
			}
			if(addBalance > 0) {
			System.out.println("Your account balance is " + (balance + addBalance) + ". Thank you!");
			}
		}		
		if(input.equalsIgnoreCase("N")) {
			userMenu(username, password);
		}
		scan.close();
}	

		
			
	public static void userMenu(String username, String password) {
		
		Scanner scan = new Scanner(System.in);
		User u = new User();
		System.out.println("Welcome!  What would you like to do?\n 1: Update Information\n "
				+ "2: Check your Account Balance\n 3: Add a User to your Account\n "
				+ "");
		int option = scan.nextInt();
		switch(option) {
		case 1:
			System.out.println("What would you like to change?\n 1: Update Password\n 2: Update Address\n "
					+ "3: Update City\n 4: Update State\n 5: Update Phone #");
			switch(option) {
			case 1: u.setPassword(null);
			case 2: u.setAddress(null);
			case 3: u.setCity(null);
			case 4: u.setState(null);
			case 5: u.setPhone(null);
			}
		case 2:
			addMore();
	}
	
	}
public static void login() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello!\n 1: Login \n 2: Return");
		int option = scan.nextInt();
		switch(option) {
			case 1:
				User user = new User();
				final String checkUser = "select user_name from users where user_name = ?";
				Connection conn = null;
				PreparedStatement stmt = null;
				ResultSet set = null;
				
				try{ 
				conn= ConnectUtil.getConnection();
				stmt = conn.prepareStatement(checkUser);
				set = stmt.executeQuery(checkUser);
				stmt.setString(1, user.getUserName());
					} catch (SQLException e) {}
				System.out.println("Please enter your username:");
				String username = scan.next();
				final String checkPass = "select user_pass from users where user_name = ?";
					if(username.matches(checkUser)) {
						try{ 
							conn= ConnectUtil.getConnection();
							stmt = conn.prepareStatement(checkUser);
							set = stmt.executeQuery(checkPass);
							stmt.setString(1, user.getPassword());
							} catch (SQLException e) {}
					
						System.out.println("Please enter your password:");
						String password = scan.next();
						
						if(password.matches(checkPass)){
													}
				
					}
				else {
					System.out.println("Username not recognized. Please try again."); //how do i return to the start of case 1?
				}
			case 2:
				b.mainMenu();
		}
		scan.close();
	}
}
