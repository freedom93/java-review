package com.freedom.adapter2;

public class Adapter extends Source implements Targetable {

	
	//类的适配配器模式
	@Override
	public void method2() {
	   System.out.print("method2---Targetable");

	}

}
