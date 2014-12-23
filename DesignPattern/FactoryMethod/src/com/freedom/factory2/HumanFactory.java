package com.freedom.factory.factory2;

import java.util.List;
import java.util.Random;

public class HumanFactory {
	
	//批量随机生产
	public static Human createHuman(){
		Human human=null; //定义一个类型的人类
		//首先是获得有多少个实现类，多少个人种
		List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class); //定义了多少人种
		//System.out.println(concreteHumanList.toString());
		//随机生产什么人种都OK
		Random random = new Random();
		int rand = random.nextInt(concreteHumanList.size());
		human = createHuman(concreteHumanList.get(rand));
		return human;
	}

	//人种定向生产
	public static Human createHuman(Class c) {
		
		Human human = null; // 定义一个类型的人类
		try {
			human = (Human) Class.forName(c.getName()).newInstance();

		} catch (InstantiationException e) {
			System.out.println("必须指定人种的颜色");
		} catch (IllegalAccessException e) {
			System.out.println("人种定义错误！");
		} catch (ClassNotFoundException e) {
			System.out.println("Sorry，你指定的人种找不到！");
		}
		return human;
	}
	
}
