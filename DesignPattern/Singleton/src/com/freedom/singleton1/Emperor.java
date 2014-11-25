package com.freedom.singleton1;
/**
 * 事先声明，本人爱扯，不喜欢看故事的请自动屏蔽//注释。
 * @author freedom
 * Emperor 皇帝类
 * 中国的历史上一般都是一个朝代一个皇帝，有两个的话，必然要PK出一个，所以亲们不要纠结PK期哦！
 */
public class Emperor {

	
	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */  
	private static Emperor emperor = null; //定义一个皇帝，描述一下这个皇帝的特征
	
	/* 私有构造方法，防止被实例化 */  
	private Emperor() {
		//在地球人世俗和道德条条框框下，你是不允许产生第二个皇帝,否则生灵涂炭的灾难每日都在上演
		//所以注意构造方法是private而不是public
	}

	/* 静态工程方法，创建实例 */  
	public static Emperor getInstance() {
		if (emperor == null) { // 如果皇帝还没有定义，那就定一个
			emperor = new Emperor();
		}
		return emperor;
	}

	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
	public static void emperorInfo() {
		// 描述皇帝的特征：比如长得帅不帅，高不高，后宫佳丽是三千还是三万，是政治天才还是祸国殃民的蠢才……
		System.out.println("名未知，字未来，眉清目秀，身高八尺，后宫佳丽三千万，个个能歌善武，出的了厅堂，上得了战场，所以你说是政治天才还是祸国殃民的蠢才呢？");
	}
}
