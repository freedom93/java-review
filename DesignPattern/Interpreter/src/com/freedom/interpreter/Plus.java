package com.freedom.interpreter;

public class Plus implements Expression {

	@Override
	public int interpret(Context context) {
		return context.getA()+context.getB();
	}

}
