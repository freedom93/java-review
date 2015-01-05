package com.freedom.bridge;

public class ScarfComputer extends Computers{

	@Override
	protected void produce() {
		System.out.println("这个公司是生产围巾的……");
		
	}

	@Override
	protected void sell() {
		System.out.println("虽然没什么戴围巾的习惯，但是天还是这么冷，会大卖吧……");
		
	}
	
	public void makeMoney(){
		super.makeMoney();
		System.out.println("围巾赚的还真不少……");
	}

}
