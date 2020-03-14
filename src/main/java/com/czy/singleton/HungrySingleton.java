package com.czy.singleton;

/**
 *  饿汉式
 * @author yangyonglong
 * @version 1.0
 * @className HungrySingleton
 * @date 2020-03-02 20:22
 **/
public class HungrySingleton {

	private static HungrySingleton hungrySingleton = new HungrySingleton();

//	static {
//		hungrySingleton = new HungrySingleton();
//	}
	private HungrySingleton(){}
	public static HungrySingleton getHungrySingleton() {
		return hungrySingleton;
	}
}
