package service;

import presentation.login.LoginInput;
import presentation.login.UserModel;

public interface UserLoginServiceInterface {
	
	UserModel authenticateLoginInput(LoginInput loginInput);
	
	UserModel createLogin(LoginInput loginInput, boolean isManager);

}
