package com.freedom.factory.factory2;

import org.junit.Test;

public class TestFactory2 {

	@Test
	public void test() {
		for(int i=0; i<10; i++){
			System.out.println("---随机生产---" + i);
			Human human = HumanFactory.createHuman();
			human.say();
			human.smile();
			}
	}
	
}
