package project0.repos;

import java.util.List;

import project0.models.User;

public interface UserRepo {

	void save(User user);
	
	
	User findByUsername(String username);
	
	
	User findByName(String fullName);
	
	
	void updatePassword(User username);
	
	
	void updateAddress(User address);
	
	
	void updateCity(User city);
	
	
	void updateState(User state);
	
	
	void updatePhone(User phone);
	
	
	void addToBalance(int balance);
	
	
	void delete(User user);


	void addToBalance(User balance);
	
	
}
