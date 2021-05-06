package nLayered;

import java.util.Scanner;

import nLayered.business.concretes.LoggerManager;
import nLayered.business.concretes.UserManager;
import nLayered.core.GoogleManagerAdaptor;
import nLayered.core.GoogleManagerService;
import nLayered.dataAccess.concretes.SqlDatabaseDao;
import nLayered.entities.concretes.User;
import nLayered.google.GoogleManager;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		UserManager userManager=new UserManager(new SqlDatabaseDao(),new LoggerManager() );
		User user=new User(1,"Sumeyya","Eser","1234567", "smeyyaeser@gmail.com");
		
		
		userManager.signUp(new User(1,"Sumeyya","Eser","1234567", "smeyyaeser@gmail.com"));
		userManager.signUp(new User(2,"Ayse","Bal","456", "ayse@gmail.com"));
		userManager.signUp(new User(3,"ahmet","Eser","789", "ahmet@gmail.com"));
		
	     //userManager.delete(user);
	
	
	GoogleManagerAdaptor gAdaptor=new GoogleManagerAdaptor();
	gAdaptor.logger("Sumeyya Eser");
	System.out.print("email: ");
	String email=scanner.nextLine();
	System.out.print("sifre : ");
	String password=scanner.nextLine();
	userManager.login(email, password);
	
	
	
	
	}

}
