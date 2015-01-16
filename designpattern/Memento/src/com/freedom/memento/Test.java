package com.freedom.memento;

public class Test {

	public static void main(String[] args) {

		Original origi = new Original("apple");
		Storage sto = new Storage(origi.createMemento());
		System.out.println("初始化状态："+origi.getValue());
		origi.setValue("pair");
		System.out.println("修改后状态："+origi.getValue());
		origi.restoreMemento(sto.getMemento());
		System.out.println("恢复后状态："+origi.getValue());
	}

}
