package presentation.login;

public interface LoginControllerInterface {

	UserModel authenticateLogin(LoginInput loginInput);
	
	UserModel createLogin(LoginInput loginInput, boolean isManager);
	
}
