package com.freedom.mediator;

public abstract class User {
	
	public Mediator mediator;
	
	public Mediator getMediator(){
		return mediator;
	}
	
	public User(Mediator mediator){
		this.mediator = mediator;
	}
	
	public abstract void work();

}
