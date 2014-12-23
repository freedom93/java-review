package com.freedom.factory.abstractfactory;


public abstract class AbstractBlackHuman implements Human2{
	
	
	@Override
	public void say() {
		System.out.println("black human can say anything!");
		
	}

	@Override
	public void smile() {
		System.out.println("black human can smile!");
		
	}

}
