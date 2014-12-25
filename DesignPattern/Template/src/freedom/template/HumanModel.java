package com.freedom.template;

public abstract class HumanModel {

	final public void createHuman(){
		this.say();
		if(isSmile()){
			this.smile();
		}
	}
	
	protected abstract void say();
	
	protected abstract void smile();
	
	protected boolean isSmile(){
		System.out.println("Default value is yes! Smile!");
		return true;
	}
}
