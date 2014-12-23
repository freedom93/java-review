package com.freedom.factory.abstractfactory;

public class FemaleHumanFactory extends AbstractHumanFactory {
	// 创建一个女性黑种人
	public Human2 createBlackHuman() {
		return super.createHuman(HumanEnum.BlackFemaleHuman);
	}

	// 创建一个女性白种人
	public Human2 createWhiteHuman() {
		return super.createHuman(HumanEnum.WhiteFemaleHuman);
	}

	// 创建一个女性黄种人
	public Human2 createYellowHuman() {
		return super.createHuman(HumanEnum.YelloFemaleHuman);
	}
}