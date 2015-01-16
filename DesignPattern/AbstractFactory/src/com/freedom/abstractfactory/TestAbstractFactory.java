package com.freedom.factory.abstractfactory;

import org.junit.Test;

public class TestAbstractFactory {

	@Test
	public void test3() {
		//第一条生产线，男性生产线
		HumanFactory maleHumanFactory = new MaleHumanFactory();
		//第二条生产线，女性生产线
		HumanFactory femaleHumanFactory = new FemaleHumanFactory();
		//生产线建立完毕，开始生产人了:
		Human2 maleYellowHuman = maleHumanFactory.createYellowHuman();
		Human2 femaleYellowHuman = femaleHumanFactory.createYellowHuman();
		maleYellowHuman.say();
		maleYellowHuman.smile();
		femaleYellowHuman.gender();
		/*
		* .....
		* 后面shi dan （随便）你了！
		*/
	}
	

}
