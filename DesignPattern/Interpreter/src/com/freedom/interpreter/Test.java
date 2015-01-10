package com.freedom.interpreter;

public class Test {

	public static void main(String[] args) {
		int resultPlus = new Plus().interpret(new Context(3, 5));
		System.out.println(resultPlus);
		int resultMinus = new Minus().interpret(new Context(3, 5));
		System.out.println(resultMinus);

	}

}
