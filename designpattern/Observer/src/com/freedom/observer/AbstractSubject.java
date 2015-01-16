package com.freedom.observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {

	public Vector<Observer> vector = new Vector<Observer>();
	@Override
	public void add(Observer obs) {
		
		vector.add(obs);
	}

	@Override
	public void del(Observer obs) {

		vector.remove(obs);
	}

	@Override
	public void notifyObservers() {

		Enumeration<Observer> enumo = vector.elements();
		while (enumo.hasMoreElements()) {
			enumo.nextElement().update();
		} 

	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub

	}

}
