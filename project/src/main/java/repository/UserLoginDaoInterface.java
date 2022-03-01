package repository;

import java.sql.SQLException;

public interface UserLoginDaoInterface {

	/*
	 * Create Read Update Delete
	 */
	
	//Create
	
	UserEntity insertUser(String username, String password, boolean isManager) throws SQLException;
	
	//Read
	
	UserEntity getUser(String username) throws SQLException;
	
	//Update
	
	UserEntity updateUsername(int id, String newUsername);
	
	
	//Delete
	
	UserEntity deleteUser(int id);
}
