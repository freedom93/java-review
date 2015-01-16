package com.freedom.observer;


import org.junit.Test;

public class TestObserver {

	@Test
	public void test() {
		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());
		sub.operation();
	}

}
