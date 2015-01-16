package com.freedom.iterator;

public class Test {
	public static void main(String[] args) {
		Collection collector = new MyCollection();
		Iterator it = collector.iterator();
		//System.out.println(it.first());
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
