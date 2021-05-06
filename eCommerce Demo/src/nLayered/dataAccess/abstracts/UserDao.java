package nLayered.dataAccess.abstracts;

import java.util.List;

import nLayered.entities.concretes.User;
//Database islemleri
public interface UserDao {

	void add(User user);
	void delete(User user);
	boolean getControl(String mail);
	List<User> getUser();
}
