package com.freedom.proxy;

public class Proxy implements  Factory {

	private Customer customer;
	public Proxy(){
		super();
		this.customer = new Customer();
	}
	
	@Override
	public void sell() {

		Before();
		customer.sell();
		After();
		
	}
	
	private void Before(){
		System.out.println("Before proxy");
	}
	
	private void After(){
		System.out.println("After proxy");
	}

}
