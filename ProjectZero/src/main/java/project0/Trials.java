package project0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import project0.models.User;
import project0.util.ConnectUtil;

public class Trials {
	
static	Trials t = new Trials();


	
	public static void main(String[] args) {
		t.login();
		}
		
	public void login() {
		
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
							//userMenu();
						}
				
					}
				else {
					System.out.println("Username not recognized. Please try again."); //how do i return to the start of case 1?
				}
			case 2:
				//mainMenu();
		}
		scan.close();
	}



}