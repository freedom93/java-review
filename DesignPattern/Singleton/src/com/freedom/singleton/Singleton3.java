package com.freedom.singleton;

public class Singleton3 {
	
	
	private Singleton3(){
		
	}
	//静态内部类
	private static class SingletonFactory{
		private static Singleton3 instance = new Singleton3();
	}
	
	public static Singleton3 getInstance(){
		return SingletonFactory.instance;
	}
	
	public Object readResolve(){
		return getInstance();
	}

}