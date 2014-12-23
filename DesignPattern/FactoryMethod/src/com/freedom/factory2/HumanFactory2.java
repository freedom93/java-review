package com.freedom.factory.factory2;

import java.util.HashMap;

public class HumanFactory2 {
	// 定义一个MAP,初始化过的Human对象都放在这里
	private static HashMap<String, Human> humans = new HashMap<String, Human>();

	public static Human createHuman(Class c) {
		Human human = null; // 定义一个类型的人类
		try {
			//这个在类初始化很消耗资源的情况比较实用，比如你要连接硬件，或者是为了初始化一个类需要准备比较多条件（参数），通过这种方式可以很好的减少项目的复杂程度。
			// 如果MAP中有，则直接从取出，不用初始化了
			if (humans.containsKey(c.getSimpleName())) {
				human = humans.get(c.getSimpleName());
			} else {
				human = (Human) Class.forName(c.getName()).newInstance();
				// 放到MAP中
				humans.put(c.getSimpleName(), human);
			}
		} catch (InstantiationException e) {
			System.out.println("必须指定人种的颜色");
		} catch (IllegalAccessException e) {
			System.out.println("人种定义错误！");
		} catch (ClassNotFoundException e) {
			System.out.println("混蛋，你指定的人种找不到！");
		}
		return human;
	}
}
