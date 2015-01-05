package com.freedom.bridge;

public abstract class Computers {
	protected abstract void produce();
	protected abstract void sell();
	public void makeMoney(){
		this.produce();
		this.sell();
	}
}
