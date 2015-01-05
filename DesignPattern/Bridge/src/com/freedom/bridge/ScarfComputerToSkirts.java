package com.freedom.bridge;

public class ScarfComputerToSkirts extends Computers2{

	
	public ScarfComputerToSkirts(Skirts skirts) {
		super(skirts);
	}

	public void makeMoney(){
		super.makeMoney();
		System.out.println("小短裙在夏天很赚钱……");
	}

}
