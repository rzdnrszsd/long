package com.czy.singleton;

/**
 * @author yangyonglong
 * @version 1.0
 * @className LazyDoubleCheckSingleton
 * @date 2020-03-02 20:59
 **/
public class LazyDoubleCheckSingleton {
	private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
	private LazyDoubleCheckSingleton(){}

	public static LazyDoubleCheckSingleton getLazyDoubleCheckSingleton() {
		if(lazyDoubleCheckSingleton==null){
			synchronized(LazyDoubleCheckSingleton.class){
				if(lazyDoubleCheckSingleton==null){
					lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
				}
			}
		}
		return lazyDoubleCheckSingleton;
	}
}
