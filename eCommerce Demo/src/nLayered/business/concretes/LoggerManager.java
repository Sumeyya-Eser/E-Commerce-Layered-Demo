package nLayered.business.concretes;

import nLayered.business.abstracts.LoggerService;

public class LoggerManager implements LoggerService{

	@Override
	public void sendMessage(String message) {
		System.out.println("Kayit olundu, hesap onaylandý: " + message);
		
	}

}
