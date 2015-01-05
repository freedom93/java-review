package com.freedom.bridge;

public abstract class Computers2 {
	private Products product;
	public Computers2(Products product){
		this.product = product;
	}
	
	public void makeMoney(){
		this.product.beProduced();
		this.product.beSold();
	}
}
