package com.freedom.singleton2;

/**
 * @author freedom
 * SingletonPattern 通用单例模式
 * 
 */
public class SingletonPattern {
	private static SingletonPattern singletonPattern = null;

	// 私有构造方法,限制住不能直接new产生一个实例
	private SingletonPattern() {
	}

	public SingletonPattern getInstance() {
		if (this.singletonPattern == null) { // 如果还没有实例，则创建一个
			this.singletonPattern = new SingletonPattern();
		}
		return this.singletonPattern;
	}
}
