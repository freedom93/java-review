package com.freedom.prototype;

import java.util.ArrayList;

public class Prototype1 implements Cloneable {
	private ArrayList list = new ArrayList();

	public Prototype1 clone() {
		Prototype1 prototype = null;
		try {
			prototype = (Prototype1) super.clone();
			prototype.list = (ArrayList) this.list.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototype;
	}
}