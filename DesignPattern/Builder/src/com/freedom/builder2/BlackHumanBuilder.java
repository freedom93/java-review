package com.freedom.builder2;

import java.util.ArrayList;

public class BlackHumanBuilder extends HumanBuilder{
	
	private BlackHuman blackHuman = new BlackHuman();

	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.blackHuman.setSequence(sequence);
		
	}

	@Override
	public HumanModel getHumanModel() {
		return this.blackHuman;
	}
	
}
