package com.freedom.factory.abstractfactory;


public interface HumanFactory {
	
	//制造黄色人种
	public Human2 createYellowHuman();
	//制造一个白色人种
	public Human2 createWhiteHuman();
	//制造一个黑色人种
	public Human2 createBlackHuman();
	
}
