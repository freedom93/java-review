package com.freedom.factory.abstractfactory;

public abstract class AbstractHumanFactory implements HumanFactory {

	/*
	 * 给定一个性别人种，创建一个人类出来专业术语是产生产品等级
	 */
	protected Human2 createHuman(HumanEnum HumanEnum) {
		Human2 human = null;
		// 如果传递进来不是一个Enum中具体的一个Element的话，则不处理
		if (!HumanEnum.getValue().equals("")) {
			try {
				// 直接产生一个实例
				human = (Human2) Class.forName(HumanEnum.getValue()).newInstance();
			} catch (Exception e) {
				// 因为使用了enum，这个种异常情况不会产生了，除非你的enum有问题；
				e.printStackTrace();
			}
		}
		return human;
	}

}
