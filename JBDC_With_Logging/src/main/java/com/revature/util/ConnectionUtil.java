package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	/*
	 * to avoid writing same code several times throughout our application, 
	 * we will create a utility class for easily grabbing connections to our database
	 * 
	 * we define a method that returns a new connection on each call
	 */
	 public static Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection(
				System.getenv("db_url"),
				System.getenv("db_username"),
				System.getenv("db_password")
				);
	}
}
