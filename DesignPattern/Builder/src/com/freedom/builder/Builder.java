package com.freedom.builder;

import java.util.ArrayList;
import java.util.List;

public class Builder {
	
	private List<Sender> list = new ArrayList<>();
	
	public void produceMail(int count){
		for(int i=0; i < count; i++){
			list.add(new MailSender());
			list.get(i).send();
		}
	}
	
	public void produceSms(int count){
		for(int i=0; i < count; i++){
			list.add(new SmsSender());
			list.get(i).send();
		}
	}

}
