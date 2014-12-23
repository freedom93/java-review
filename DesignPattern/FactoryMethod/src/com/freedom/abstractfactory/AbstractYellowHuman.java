package com.freedom.factory.abstractfactory;


public abstract class AbstractYellowHuman implements Human2{
	
	
	@Override
	public void say() {
		System.out.println("yellow human can say anything!");
		
	}

	@Override
	public void smile() {
		System.out.println("yellow human can smile!");
		
	}

}
