package com.freedom.singleton3;

/**
 * @author freedom 
 * SingletonPattern 通用单例模式
 */
public class SingletonPattern {
	private static final SingletonPattern singletonPattern = new SingletonPattern();

	// 限制住不能直接产生一个实例
	private SingletonPattern() {
	}

	public synchronized static SingletonPattern getInstance() {
		return singletonPattern;
	}

}
