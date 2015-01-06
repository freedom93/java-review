package com.freedom.flyweight;

public class Singleton {
	
	private static Singleton instance = null;
	private String name;
	
	private Singleton(String name){
		this.name = name;
	}
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton("freedom");
		}
		return instance;
	}
	
	public static void main(String[] args) {
		System.out.println(Singleton.getInstance().name);
	}
	
}
