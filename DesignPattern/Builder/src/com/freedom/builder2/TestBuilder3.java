package com.freedom.builder2;

import org.junit.Test;

public class TestBuilder3 {

	@Test
	public void client() {
		Director director = new Director();
		// 1W只A型的白人
		for (int i = 0; i < 10000; i++) {
			director.getAHumanModel().run();
		}
		// 100WB型的白人
		for (int i = 0; i < 1000000; i++) {
			director.getBHumanModel().run();
		}
		// 1000WC型的黑人
		for (int i = 0; i < 10000000; i++) {
			director.getCHumanModel().run();
		}

	}

}
