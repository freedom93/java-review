package com.freedom.builder2;

import java.util.ArrayList;

public abstract class HumanBuilder {

	//建造一个模型，给我一个顺序，我就create这个顺序的人模型
	public abstract void setSequence(ArrayList<String> sequence);
	
	//设置完毕顺序后，直接拿到这个人模型
	public abstract HumanModel getHumanModel();
}
