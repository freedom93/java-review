package com.freedom.bridge;

public class Skirts extends Products{

	@Override
	protected void beProduced() {
		System.out.println("小短裙正在生产了一大波……");
		
	}

	@Override
	protected void beSold() {
		System.out.println("夏天来了！小短裙正在热卖……");
		
	}

}
