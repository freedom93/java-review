package com.freedom.singleton;



public class SingleTon2 {
	private static class SingleTonFactory{
		private static SingleTon2 instance = new SingleTon2();
	}
	
	public static SingleTon2 getInstance(){
		return SingleTonFactory.instance;
	}

}
