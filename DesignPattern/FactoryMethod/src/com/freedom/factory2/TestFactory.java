package com.freedom.factory.factory2;

import org.junit.Test;

public class TestFactory {

	@Test
	public void test() {
		System.out.println("生产的第一批人是：白人");
		Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
		whiteHuman.say();
		whiteHuman.smile();
	}
	
	@Test
	public void test2() {
		System.out.println("生产的第二批人是：黑人");
		Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
		blackHuman.say();
		blackHuman.smile();
	}
	
	@Test
	public void test3() {
		System.out.println("生产的第三批人是：黄人");
		Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
		yellowHuman.say();
		yellowHuman.smile();
	}
	

}
