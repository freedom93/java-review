package com.freedom.bridge;

public class SocksComputer extends Computers{

	@Override
	protected void produce() {
		System.out.println("这个公司是生产袜子……");
		
	}

	@Override
	protected void sell() {
		System.out.println("袜子大卖……");
		
	}
	
	public void makeMoney(){
		super.makeMoney();
		System.out.println("袜子超赚钱……");
	}

}
