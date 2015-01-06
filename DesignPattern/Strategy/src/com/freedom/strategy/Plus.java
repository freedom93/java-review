package com.freedom.strategy;

public class Plus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculator(String exp) {
		
		int arrayInt[] = split(exp, "\\+");
		
		return arrayInt[0]+arrayInt[1];
	}

}
