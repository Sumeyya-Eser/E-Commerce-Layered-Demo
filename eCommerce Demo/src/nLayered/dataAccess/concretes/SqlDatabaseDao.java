package nLayered.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayered.dataAccess.abstracts.UserDao;
import nLayered.entities.concretes.User;

public class SqlDatabaseDao implements UserDao{

	List<User> controlUser=new ArrayList<User>(); //user array referans olusturma
	@Override
	public void add(User user) {
		controlUser.add(user);
	}

	@Override
	public void delete(User user) {
		user=controlUser.remove(user.getId());
		System.out.println(user.getName() + " adli kullanici silindi");
		
	}

	@Override
	public boolean getControl(String mail) {
		for(User user:controlUser) {
			if(user.geteMail().equals(mail)) {
				return true;
			}
		}return false;
	}

	@Override
	public List<User> getUser() {
		
		return controlUser;
	}

}
