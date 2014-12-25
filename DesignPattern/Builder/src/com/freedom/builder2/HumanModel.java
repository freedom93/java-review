package com.freedom.builder2;

import java.util.ArrayList;

public abstract class HumanModel {

	// 存放各个基本方法执行的顺序
	private ArrayList<String> sequence = new ArrayList<String>();

	public abstract void say();

	public abstract void smile();

	final public void createHuman() {
		//使用数组的遍历，确定那个先执行
		for (int i = 0; i < this.sequence.size(); i++) {
			String actionName = this.sequence.get(i);
			if (actionName.equalsIgnoreCase("say")) {
				this.say();
			} else if (actionName.equalsIgnoreCase("smile")) {
				this.smile();
			}
		}
	}

	// setSequence 方法是允许客户自己设置一个顺序,把传递过来的值传递到类内
	final public void setSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}

}
