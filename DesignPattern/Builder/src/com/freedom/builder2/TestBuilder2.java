package com.freedom.builder2;

import java.util.ArrayList;

import org.junit.Test;

public class TestBuilder2 {

	@Test
	public void client() {
		
		//客户说我要你给我先笑再说的
		ArrayList<String> sequence = new ArrayList<String>(); //存放run的顺序
		sequence.add("smile"); //客户要求，先笑
		sequence.add("say"); //再说话
		//要一个白人
		WhiteHumanBuilder whiteHumanBuilder = new WhiteHumanBuilder();
		whiteHumanBuilder.setSequence(sequence);
		WhiteHuman whiteHuman =  (WhiteHuman) whiteHumanBuilder.getHumanModel();
		whiteHuman.createHuman();
		//要一个黑人
		BlackHumanBuilder blackHumanBuilder = new BlackHumanBuilder();
		blackHumanBuilder.setSequence(sequence);
		BlackHuman blackHuman =  (BlackHuman) blackHumanBuilder.getHumanModel();
		blackHuman.createHuman();
	}
	
}
