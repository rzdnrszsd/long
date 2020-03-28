package com.czy.singleton;

/**
 * @author yangyonglong
 * @version 1.0
 * @className ExectorThread
 * @date 2020-03-02 20:28
 **/
public class ExectorThread implements Runnable {
	@Override
	public void run() {
//		LazySingleton lazySingleton = LazySingleton.getInstance();
//		LazyDoubleCheckSingleton lazySingleton = LazyDoubleCheckSingleton.getLazyDoubleCheckSingleton();
//		LazyInnerClassSingleton lazyInnerClassSingleton = LazyInnerClassSingleton.getInstance();
		StaticSingleton staticSingleton = StaticSingleton.getStaticSingleton();
		System.out.println(Thread.currentThread().getName()+":"+staticSingleton);
	}
}
