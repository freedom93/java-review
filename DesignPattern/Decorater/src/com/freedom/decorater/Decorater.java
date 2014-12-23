package com.freedom.decorater;

public class Decorater implements Sourceable {
	private Sourceable source;
	
	public Decorater(Sourceable source){
		super();
		this.source = source;
	}

	@Override
	public void nature() {
		source.nature();
		System.out.println("Nature after decorating : entusiastico");
	}

}
