package com.freedom.interpreter;

public class Minus implements Expression {

	@Override
	public int interpret(Context context) {
		return context.getA()-context.getB();
	}

}
