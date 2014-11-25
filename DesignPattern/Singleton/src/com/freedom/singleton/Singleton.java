package com.freedom.singleton;

public class Singleton {
	
	private static Singleton instance = null;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
	public Object readResolve(){
		return instance;
	}
	
	//线程安全
	public static Singleton getInstance2(){
		synchronized (instance) {
			if(instance == null){
				instance = new Singleton();
			}
		}
		
		return instance;
	}

}
