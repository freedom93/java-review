package com.freedom.builder2;

import java.util.ArrayList;

public class WhiteHumanBuilder extends HumanBuilder{
	
	private WhiteHuman whiteHuman = new WhiteHuman();

	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.whiteHuman.setSequence(sequence);
		
	}

	@Override
	public HumanModel getHumanModel() {
		return this.whiteHuman;
	}
	
}
