package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import service.ConnectionFactory;

public class UserLoginDao implements UserLoginDaoInterface{

	public UserEntity insertUser(String username, String password, boolean isManager) throws SQLException {
		final String SQL = "INSERT INTO user_login VALUES(default, ?, ?, ?) RETURNING *";
		UserEntity userEntity = null;
		ResultSet resultSet = null;
		
		try(
				Connection conn = ConnectionFactory.getConnection();
				PreparedStatement stmt = conn.prepareStatement(SQL)
				){
			stmt.setString(1, username);
			stmt.setString(2, password);
			stmt.setBoolean(3, isManager);
			resultSet = stmt.executeQuery();
			
			if(resultSet.next()) {
				userEntity = new UserEntity(
						resultSet.getInt(1),
						resultSet.getString(2),
						resultSet.getString(3),
						resultSet.getBoolean(4)
						);
			}
			
			resultSet.close();
		}
		
		return userEntity;
	}

	public UserEntity getUser(String username) {
		
		UserEntity userEntity = null;
		
		final String SQL = "SELECT * FROM user_login WHERE username = ?";
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		
		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(SQL);
			
			statement.setString(1, username);
			resultSet = statement.executeQuery();
			
			if(resultSet.next()) {
				userEntity = new UserEntity(
						resultSet.getInt(1),
						resultSet.getString(2),
						resultSet.getString(3),
						resultSet.getBoolean(4)
						);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				statement.close();
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return userEntity;
	}

	public UserEntity updateUsername(int id, String newUsername) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserEntity deleteUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
