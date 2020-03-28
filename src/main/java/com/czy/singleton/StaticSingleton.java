package com.czy.singleton;

/**
 * @author yangyonglong
 * @version 1.0
 * @className StaticSingleton
 * @date 2020-03-02 21:20
 **/
public class StaticSingleton {
	private static StaticSingleton staticSingleton = null;
	static {
		staticSingleton = new StaticSingleton();
		System.out.println(Thread.currentThread().getName()+"..");
	}

	private StaticSingleton(){}

	public static StaticSingleton getStaticSingleton() {
		return staticSingleton;
	}
}
