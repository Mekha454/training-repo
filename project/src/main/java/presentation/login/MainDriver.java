package presentation.login;

import repository.UserLoginDao;
import service.UserLoginService;

public class MainDriver {
	
	
	public static void main(String[] args) {
		LoginController loginController = new LoginController(new UserLoginService(new UserLoginDao()));
		System.out.println(loginController.authenticateLogin(new LoginInput("user3", "pass")));
		System.out.println(loginController.createLogin(new LoginInput("user3", "pass"), false));
	}

}
