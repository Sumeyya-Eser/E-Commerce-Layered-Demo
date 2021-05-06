package nLayered.business.abstracts;

import nLayered.entities.concretes.User;

public interface UserService {
	
	void login(String eMail, String password);
	void signUp(User user);
	void delete(User user);

}
