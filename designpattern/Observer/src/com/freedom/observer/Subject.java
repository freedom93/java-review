package com.freedom.observer;

public interface Subject {
	
	public void add(Observer obs);
	
	public void del(Observer obs);
	
	public void notifyObservers();
	
	public void operation();

}
