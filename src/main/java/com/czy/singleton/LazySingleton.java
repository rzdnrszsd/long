package com.czy.singleton;

/**
 * @author yangyonglong
 * @version 1.0
 * @className LazySingleton
 * @date 2020-03-02 20:25
 **/
public class LazySingleton {
	private static LazySingleton lazySingleton = null;

	private LazySingleton() {
	}

	/**
	 * 解决了多线程的安全问题 但是不能解决 线程数量过多 安全问题
	 * @return
	 */
	public synchronized static  LazySingleton getInstance() {
		if (lazySingleton == null) {
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	}
}
