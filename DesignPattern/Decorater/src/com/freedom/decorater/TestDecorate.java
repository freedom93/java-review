package com.freedom.decorater;


import org.junit.Test;

public class TestDecorate {

	@Test
	public void test() {

		Sourceable source = new Source();
		Sourceable sa = new Decorater(source);
		sa.nature();
	
	}

}
