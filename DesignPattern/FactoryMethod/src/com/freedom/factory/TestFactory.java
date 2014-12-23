package com.freedom.factory;

import org.junit.Test;

public class TestFactory {

	@Test
	public void test() {
		SendFactory sf = new SendFactory();
		Sender send = sf.produce("sms");
		send.send();
	}
	
	@Test
	public void test2() {
		SendFactory2 sf = new SendFactory2();
		Sender send = sf.produceMail();
		send.send();
		Sender send2 = sf.produceSms();
		send2.send();
	}
	
	//static Factory Method
	@Test
	public void test3() {
		Sender send = SendFactory3.produceMail();
		send.send();
		Sender send2 = SendFactory3.produceSms();
		send2.send();
	}
	
	//Abstract Factory Method
	@Test
	public void test4() {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.send();
		
	}


}
