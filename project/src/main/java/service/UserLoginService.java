package service;

import java.sql.SQLException;

import presentation.login.LoginInput;
import presentation.login.UserModel;
import repository.UserEntity;
import repository.UserLoginDao;

public class UserLoginService implements UserLoginServiceInterface{

	private UserLoginDao userLoginDao;
	
	public UserLoginService(UserLoginDao userLoginDao) {
		super();
		this.userLoginDao = userLoginDao;
	}

	public UserModel authenticateLoginInput(LoginInput loginInput) {
		
		UserEntity userLoginEntity = userLoginDao.getUser(loginInput.getUsername());
		
		return convertUserEntity(userLoginEntity);
	}

	private UserModel convertUserEntity(UserEntity userLoginEntity) {
		return new UserModel(userLoginEntity.getUsername(), userLoginEntity.isManager());
	}

	public UserModel createLogin(LoginInput loginInput, boolean isManager) {
		try {
			return convertUserEntity(userLoginDao.insertUser(loginInput.getUsername(), loginInput.getPassword(), isManager));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
