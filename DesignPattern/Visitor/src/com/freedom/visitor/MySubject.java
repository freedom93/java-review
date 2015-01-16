package com.freedom.visitor;

public class MySubject implements Subject {

	@Override
	public String getSubject() {
		return "love";
	}

	@Override
	public void accept(Visitor visitor) {

		visitor.visit(this);
	}

	public static void main(String[] args) {

		Visitor visitor = new MyVisitor();
		Subject sub = new MySubject();
		sub.accept(visitor);
	}

}
