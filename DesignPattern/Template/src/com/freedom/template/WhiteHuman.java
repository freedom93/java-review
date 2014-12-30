package com.freedom.template;

public class WhiteHuman extends HumanModel{
	
	
	@Override
	protected void say() {
		System.out.println("white human can say anything!");
		
	}

	@Override
	protected void smile() {
		System.out.println("white human can smile!");
		
	}
	
	private boolean smileFlag = true;
	
	@Override
	protected boolean isSmile(){
		return this.smileFlag;
	}
	
	public void setSmile(boolean isSmile){
		this.smileFlag = isSmile;
	}
	

}
