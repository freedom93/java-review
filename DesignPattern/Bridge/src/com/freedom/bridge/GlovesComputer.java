package com.freedom.bridge;

public class GlovesComputer extends Computers{

	@Override
	protected void produce() {
		System.out.println("这个公司是生产手套的……");
		
	}

	@Override
	protected void sell() {
		System.out.println("虽然没什么戴手套的习惯，但是天这么冷还是有市场的……");
		
	}
	
	public void makeMoney(){
		super.makeMoney();
		System.out.println("手套赚一点点……");
	}

}
