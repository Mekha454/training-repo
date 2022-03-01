package presentation.login;

import service.UserLoginService;

public class LoginController implements LoginControllerInterface{

	private UserLoginService userLoginService;
	
	public LoginController(UserLoginService userLoginService) {
		super();
		this.userLoginService = userLoginService;
	}


	public UserModel authenticateLogin(LoginInput loginInput) {
		return userLoginService.authenticateLoginInput(loginInput);
	}


	public UserModel createLogin(LoginInput loginInput, boolean isManager) {
		return userLoginService.createLogin(loginInput, isManager);
	}
	
	

}
