package com.freedom.factory.abstractfactory;

public class MaleHumanFactory extends AbstractHumanFactory {
	// 创建一个男性黑种人
	public Human2 createBlackHuman() {
		return super.createHuman(HumanEnum.BlackMaleHuman);
	}

	// 创建一个男性白种人
	public Human2 createWhiteHuman() {
		return super.createHuman(HumanEnum.WhiteMaleHuman);
	}

	// 创建一个男性黄种人
	public Human2 createYellowHuman() {
		return super.createHuman(HumanEnum.YelloMaleHuman);
	}
}
