package com.freedom.decorater;

public class Source implements Sourceable {

	@Override
	public void nature() {
		System.out.println("Nature before decorating : cool");
		
	}

}
