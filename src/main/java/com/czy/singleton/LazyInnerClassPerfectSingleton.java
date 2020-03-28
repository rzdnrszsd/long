package com.czy.singleton;

/**
 * @author yangyonglong
 * @version 1.0
 * @className LazyInnerClassPerfectSingleton
 * @date 2020-03-15 19:36
 **/
public class LazyInnerClassPerfectSingleton {

	private  LazyInnerClassPerfectSingleton() {
		if (null != LazyHolderClass.instance) {
			throw new RuntimeException("不允许创建多个实例对象");
		}
	}

	private static final LazyInnerClassPerfectSingleton getInstance() {
		return LazyHolderClass.instance;
	}

	private static class LazyHolderClass {
		private static final LazyInnerClassPerfectSingleton instance = new LazyInnerClassPerfectSingleton();
	}

	public static void main(String[] args) {
		LazyInnerClassPerfectSingleton lazyInnerClassPerfectSingleton = LazyInnerClassPerfectSingleton.getInstance();
	}
}
