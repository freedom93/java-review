package com.freedom.template;

public class BlackHuman extends HumanModel{
	
	
	@Override
	protected void say() {
		System.out.println("black human can say anything!");
		
	}

	@Override
	protected void smile() {
		System.out.println("black human can smile!");
		
	}
	
	@Override
	protected boolean isSmile(){
		System.out.println("Black man can not smile!");
		return false;
		
	}

}
