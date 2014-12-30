package com.freedom.template;

import org.junit.Test;

public class TestTemplate {

	@Test
	public void client() {
//		WhiteHuman wh = new WhiteHuman();
//		wh.createHuman();
//		BlackHuman bh = new BlackHuman();
//		bh.createHuman();
	}
	
	@Test
	public void client2() {
//		BlackHuman bh = new BlackHuman();
//		bh.createHuman();
	}
	
	@Test
	public void client3() {
		WhiteHuman wh = new WhiteHuman();
		System.out.println("我是守门的白家丁");
		wh.setSmile(true);
		wh.createHuman();
		WhiteHuman wh2 = new WhiteHuman();
		System.out.println("我是厨房劈柴的白家丁");
		wh2.setSmile(false);
		wh2.createHuman();
	}
}
