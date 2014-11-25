package com.freedom.singleton1;
/**
 * 事先声明，本人爱扯，不喜欢看故事的请自动屏蔽注释。
 * @author freedom
 * Minister 大臣
 * 大臣天天要上早朝拜见皇帝，今天拜的皇帝和昨天、前天的都是一样的！
 * 请忽略今天和昨天不一样的情况，因为昨天的PK肯定试一次惨不忍睹的厮杀，
 * 在历史的长河中，平均发生的概率在1/365以下。
 * 在singleton2中通用的单例模式会解决同一朝代有两个皇帝，你怎么确定你每天拜见都是同一个皇帝问题。
 */
public class Minister {


	public static void main(String[] args) {
		// 第一天
		Emperor emperor1 = Emperor.getInstance();
		emperor1.emperorInfo(); //第一天见的皇帝特征：名？字？高否？帅否？……
		// 第二天
		Emperor emperor2 = Emperor.getInstance();
		Emperor.emperorInfo(); //第二天见的皇帝特征：和昨天一样高？一样帅？……
		// 第三天
		Emperor emperor3 = Emperor.getInstance();
		emperor2.emperorInfo();//第三天见的皇帝特征：和昨天、前天一样高？一样帅？……
	}
}
