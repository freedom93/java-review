package com.freedom.factory;

public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("sms");

	}

}
