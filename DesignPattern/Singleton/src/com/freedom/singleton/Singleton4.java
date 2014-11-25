package com.freedom.singleton;


public class Singleton4 {
	private static Singleton4 instance = null;
	
	private Singleton4(){
		
	}
	
	//线程安全，初始化加锁
	public static synchronized void SynInit(){
		if(instance == null)
			instance = new Singleton4();
	}
	
	public static Singleton4 getInstance(){
		if(instance == null)
			SynInit();
		return instance;
	}

}
