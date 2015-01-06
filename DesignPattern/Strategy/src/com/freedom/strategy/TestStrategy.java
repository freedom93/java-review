package com.freedom.strategy;


import org.junit.Test;

public class TestStrategy {

	@Test
	public void test() {
		String exp = "3+5";
		ICalculator ic = new Plus();
		int result = ic.calculator(exp);
		System.out.println(result);
		String exp2 = "3-5";
		ICalculator ic2 = new Minus();
		int result2 = ic2.calculator(exp2);
		System.out.println(result2);
		String exp3 = "3*5";
		ICalculator ic3 = new Multiply();
		int result3 = ic3.calculator(exp3);
		System.out.println(result3);
	}

}
