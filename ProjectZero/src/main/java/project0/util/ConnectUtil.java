package project0.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectUtil {

	 public static Connection getConnection() throws SQLException {
			
			return DriverManager.getConnection(
					System.getenv("lv_url"),
					System.getenv("lv_username"),
					System.getenv("lv_password")
					);
		}
}
