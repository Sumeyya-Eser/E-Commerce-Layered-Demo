package nLayered.business.concretes;

import java.util.regex.Pattern;

import nLayered.business.abstracts.LoggerService;
import nLayered.business.abstracts.UserService;
import nLayered.dataAccess.abstracts.UserDao;
import nLayered.entities.concretes.User;

public class UserManager implements UserService{

     UserDao userDao;
	 LoggerService loggerService;
	 public static final Pattern Email_Regex = 
				Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	 
	 public UserManager() {
		 
	 }
	public UserManager(UserDao userDao, LoggerService loggerService) {
		this.userDao = userDao;
		this.loggerService = loggerService;
	}

	@Override
	public void login(String eMail, String password) {
		for(User userExample:userDao.getUser()) {
			if(eMail.equals(userExample.geteMail())&&password.equals(userExample.getPassword())) {
				System.out.println("Giris basarili---Hosgeldiniz: " + userExample.getName());
			return;
			}
			else {
			System.out.println("Kullanici bulunamadi");
		}
		
		
	}
	}

	@Override
	public void signUp(User user) {
		if(user.getPassword().length()<6) {
			System.out.println("Parola 6 dan buyuk olmali");
			return;
		}
		if(user.getName().length()<2 || user.getLastName().length()<2) {
			System.out.println("Ad ve soyadi 2 karakterden uzun yapiniz");
		}
		if(!Email_Regex.matcher(user.geteMail()).find()) {
			System.out.println("Emailinizi dogru yaziniz");
			return;
		}
		
		userDao.add(user);
		loggerService.sendMessage(user.getName());
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

}
