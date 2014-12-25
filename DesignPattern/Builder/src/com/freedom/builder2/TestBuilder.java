package com.freedom.builder2;

import java.util.ArrayList;

import org.junit.Test;

public class TestBuilder {

	@Test
	public void client() {
		/*
		* 客户说我要你给我create一个白人，先笑再说的；还要一个黑人，先说再笑的。
		*/
		HumanModel whiteHuman = new WhiteHuman();
		ArrayList<String> sequence = new ArrayList<String>(); //存放run的顺序
		sequence.add("smile"); //客户要求，先笑
		sequence.add("say"); //再说话
		//然后把这个顺序给白人：
		whiteHuman.setSequence(sequence);
		whiteHuman.createHuman();
		HumanModel blackHuman = new BlackHuman();
		ArrayList<String> sequence2 = new ArrayList<String>(); //存放run的顺序
		sequence2.add("say"); //客户要求，先说话
		sequence2.add("smile"); //再微笑
		//然后把这个顺序给黑人：
		blackHuman.setSequence(sequence2);
		blackHuman.createHuman();
	}
	
}
