package com.freedom.factory;

public class SendFactory3 {
	
	public static Sender produceMail(){
		
		return new MailSender();
		
	}
	
	public static Sender produceSms(){
		
		return new SmsSender();
		
	}

}
