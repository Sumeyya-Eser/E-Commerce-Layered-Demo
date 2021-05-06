package nLayered.core;

import nLayered.google.GoogleManager;

public class GoogleManagerAdaptor implements GoogleManagerService{
	
	
	@Override
	public void logger(String message) {
		
		GoogleManager gManager=new GoogleManager();
		gManager.signup(message);
	}

}
