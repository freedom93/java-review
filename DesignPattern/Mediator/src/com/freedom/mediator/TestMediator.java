package com.freedom.mediator;


import org.junit.Test;

public class TestMediator {

	@Test
	public void test() {

		Mediator mediator = new MyMediator();
		mediator.createmediator();
		mediator.workAll();
	
	}

}
