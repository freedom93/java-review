package com.freedom.proxy;

public class Customer implements Factory {

	@Override
	public void sell() {
		System.out.println("Customers go shopping,Factory sells.");

	}

}
