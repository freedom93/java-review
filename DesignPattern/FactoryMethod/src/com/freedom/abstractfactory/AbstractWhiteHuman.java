package com.freedom.factory.abstractfactory;


public abstract class AbstractWhiteHuman implements Human2{
	
	
	@Override
	public void say() {
		System.out.println("white human can say anything!");
		
	}

	@Override
	public void smile() {
		System.out.println("white human can smile!");
		
	}

}
